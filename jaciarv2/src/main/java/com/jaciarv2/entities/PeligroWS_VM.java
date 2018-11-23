package com.jaciarv2.entities;

import java.util.Date;
import java.util.List;

public class PeligroWS_VM {
	public int Id;
	public String Titulo; 
    public String Descripcion;
    public Date FechaRegistro;
    public Date FechaModificacion;
    public Date FechaBaja;
    public String CodigoPeligro;
    public String UrlImagen;
    public String Latitud;
    public String Longitud;
    public String Barrio;
    public String Direccion;
    public List<ImagenWS_VM> listImagenes;
    
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getCodigoPeligro() {
		return CodigoPeligro;
	}
	public void setCodigoPeligro(String codigoPeligro) {
		CodigoPeligro = codigoPeligro;
	}
	public String getUrlImagen() {
		return UrlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		UrlImagen = urlImagen;
	}
	public String getLatitud() {
		return Latitud;
	}
	public void setLatitud(String latitud) {
		Latitud = latitud;
	}
	public String getLongitud() {
		return Longitud;
	}
	public void setLongitud(String longitud) {
		Longitud = longitud;
	}
	public String getBarrio() {
		return Barrio;
	}
	public void setBarrio(String barrio) {
		Barrio = barrio;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public List<ImagenWS_VM> getListImagenes() {
		return listImagenes;
	}
	public void setListImagenes(List<ImagenWS_VM> listImagenes) {
		this.listImagenes = listImagenes;
	}
	
}