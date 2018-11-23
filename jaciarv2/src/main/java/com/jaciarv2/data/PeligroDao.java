package com.jaciarv2.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import com.jaciarv2.entities.ImagenWS_VM;
import com.jaciarv2.entities.PeligroWS_VM;

public class PeligroDao {

	public int savePeligro(PeligroWS_VM peligro){
		Connection connection = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "ubicuo", "ubicuo2017");
			
			PreparedStatement stmt = null;
			String queryInsert = "";
		
			//Inserción de Ubicación ---------------------------------------------------------------------------------
			queryInsert = "Insert into UBICACION (ID,LATITUD,LONGITUD,DIRECCION,BARRIO,CODIGO_POSTAL) " +
			"values ('',?,?,?,?,null)";
			
			stmt = connection.prepareStatement(queryInsert, new String[]{"ID"});
			stmt.setString(1, peligro.getLatitud());
			stmt.setString(2, peligro.getLongitud());
			stmt.setString(3, peligro.getDireccion());
			stmt.setString(4, peligro.getBarrio());
			
			stmt.executeUpdate();
			
			ResultSet rs = stmt.getGeneratedKeys();
			int idUbicacion = -1;
			if (rs.next()) {
				idUbicacion = rs.getInt(1);
			}			
			//--------------------------------------------------------------------------------------------------------
			
			//Inserción de Peligro -----------------------------------------------------------------------------------
			queryInsert ="Insert into PELIGRO (ID,ID_RP,TITULO,DESCRIPCION,FECHA_REGISTRO,FECHA_INGRESO,FECHA_MODIFICACION,FECHA_BAJA,CODIGO_RP,CODIGO_SEGUIMIENTO,ID_UBICACION,ID_ESTADO,MOTIVO_NO_CORRESPONDENCIA) " + 
			"values ('',?,?,?,?,?,null,null,?,null,?,'1',null)";

			stmt = connection.prepareStatement(queryInsert, new String[]{"ID"});
			stmt.setInt(1, peligro.getId());
			stmt.setString(2, peligro.getTitulo());
			stmt.setString(3, peligro.getDescripcion());
			stmt.setTimestamp(4, new Timestamp(peligro.getFechaRegistro().getTime()));
			stmt.setTimestamp(5, getCurrentTimeStamp());
			stmt.setString(6, peligro.getCodigoPeligro());
			stmt.setInt(7, idUbicacion);
			
			stmt.executeUpdate();
			
			ResultSet rs2 = stmt.getGeneratedKeys();
			int idPeligro = -1;
			if (rs2.next()) {
				idPeligro = rs2.getInt(1);
			}
			//--------------------------------------------------------------------------------------------------------

			//Inserción de Imagenes ----------------------------------------------------------------------------------
			
			for (ImagenWS_VM item : peligro.listImagenes) {
				queryInsert = "Insert into IMAGEN (ID,ID_PELIGRO,URL_IMAGEN,URL_MINIATURA) values ('',?,?,?)";
				
				stmt = connection.prepareStatement(queryInsert, new String[]{"ID"});
				stmt.setInt(1, idPeligro);
				stmt.setString(2, item.getImagePath());
				stmt.setString(3, item.getImagePathThum());
				
				stmt.executeUpdate();
				
				ResultSet rs3 = stmt.getGeneratedKeys();
				int newId = -1;
				if (rs3.next()) {
				  newId = rs3.getInt(1);
				  
				}	
				
				return idPeligro;
			}
		}
		catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}
}
