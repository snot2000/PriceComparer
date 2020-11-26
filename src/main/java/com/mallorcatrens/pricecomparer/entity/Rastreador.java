package com.mallorcatrens.pricecomparer.entity;

import java.io.Serializable;

public class Rastreador implements Serializable{

	
	private static final long serialVersionUID = 8737118164666265037L;
	
	private int idRastreador;
	private String nombre;
	private String clase;
	private String activo;
	
	
	
	public Rastreador() {
		super();
	}
	
	public Rastreador(int idRastreador, String nombre, String clase, String activo) {
		super();
		this.idRastreador = idRastreador;
		this.nombre = nombre;
		this.clase = clase;
		this.activo = activo;
	}
	public int getIdRastreador() {
		return idRastreador;
	}
	public void setIdRastreador(int idRastreador) {
		this.idRastreador = idRastreador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	
	
}
