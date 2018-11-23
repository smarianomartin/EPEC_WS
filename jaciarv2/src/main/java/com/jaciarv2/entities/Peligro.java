package com.jaciarv2.entities;

import java.util.Date;

public class Peligro {
	public int Id;
	public int IdRP;
	public String Titulo; 
    public String Descripcion;
    public Date FechaRegistro;
    public Date FechaIngreso;
    public Date FechaModificacion;
    public Date FechaBaja;
    public String CodigoRP;
    public String CodigoSeguimiento;
    public String IdUbicacion;
    public String IdEstado;
    public String MotivoNoCorrespondencia;
    
    
    
	public Peligro(int idRP, String titulo, String descripcion, Date fechaRegistro, Date fechaIngreso,
			String codigoRP) {
		super();
		IdRP = idRP;
		Titulo = titulo;
		Descripcion = descripcion;
		FechaRegistro = fechaRegistro;
		FechaIngreso = fechaIngreso;
		CodigoRP = codigoRP;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getIdRP() {
		return IdRP;
	}
	public void setIdRP(int idRP) {
		IdRP = idRP;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public Date getFechaRegistro() {
		return FechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	public Date getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	public Date getFechaModificacion() {
		return FechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		FechaModificacion = fechaModificacion;
	}
	public Date getFechaBaja() {
		return FechaBaja;
	}
	public void setFechaBaja(Date fechaBaja) {
		FechaBaja = fechaBaja;
	}
	public String getCodigoRP() {
		return CodigoRP;
	}
	public void setCodigoRP(String codigoRP) {
		CodigoRP = codigoRP;
	}
	public String getCodigoSeguimiento() {
		return CodigoSeguimiento;
	}
	public void setCodigoSeguimiento(String codigoSeguimiento) {
		CodigoSeguimiento = codigoSeguimiento;
	}
	public String getIdUbicacion() {
		return IdUbicacion;
	}
	public void setIdUbicacion(String idUbicacion) {
		IdUbicacion = idUbicacion;
	}
	public String getIdEstado() {
		return IdEstado;
	}
	public void setIdEstado(String idEstado) {
		IdEstado = idEstado;
	}
	public String getMotivoNoCorrespondencia() {
		return MotivoNoCorrespondencia;
	}
	public void setMotivoNoCorrespondencia(String motivoNoCorrespondencia) {
		MotivoNoCorrespondencia = motivoNoCorrespondencia;
	}   
}
