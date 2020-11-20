package com.mallorcatrens.pricecomparer.entity;

import java.io.Serializable;

public class Tienda implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idTienda;
	private String nombre;
	private String activo;
	
	
	
	public Tienda(int idTienda, String nombre, String activo) {
		super();
		this.idTienda = idTienda;
		this.nombre = nombre;
		this.activo = activo;
	}
	public Tienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdTienda() {
		return idTienda;
	}
	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	
	
	
}
