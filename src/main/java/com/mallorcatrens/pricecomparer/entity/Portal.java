package com.mallorcatrens.pricecomparer.entity;

import java.io.Serializable;

public class Portal implements Serializable{

	private static final long serialVersionUID = 6385598565373061486L;
	
	private int idPortal;
	private int idTienda;
	private String urlBase;
	private String activo;
	private String nombre;
	private String descripcion;
	private int idRastreador;
	
	public Portal() {
		super();
	}

	public Portal(int idPortal, int idTienda, String urlBase, String activo, String nombre, String descripcion,
			int idRastreador) {
		super();
		this.idPortal = idPortal;
		this.idTienda = idTienda;
		this.urlBase = urlBase;
		this.activo = activo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.idRastreador = idRastreador;
	}


	public int getIdPortal() {
		return idPortal;
	}

	public void setIdPortal(int idPortal) {
		this.idPortal = idPortal;
	}

	public int getIdTienda() {
		return idTienda;
	}

	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}

	public String getUrlBase() {
		return urlBase;
	}

	public void setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdRastreador() {
		return idRastreador;
	}

	public void setIdRastreador(int idRastreador) {
		this.idRastreador = idRastreador;
	}

	@Override
	public String toString() {
		return "Portal [idPortal=" + idPortal + ", idTienda=" + idTienda + ", urlBase=" + urlBase + ", activo=" + activo
				+ ", nombre=" + nombre + ", descripcion=" + descripcion + ", idRastreador=" + idRastreador + "]";
	}
	

	
	
	
}
