package com.mallorcatrens.pricecomparer.entity;

import java.io.Serializable;


public class Tienda implements Serializable{

	private static final long serialVersionUID = 1L;

	private int idTienda;
	private String nombre;
	private String activo;
	private String descripcion;
	private String foto;
	private int idDireccion;
	
	
	
	public Tienda(int idTienda, String nombre, String activo, String descripcion, String foto, int idDireccion) {
		super();
		this.idTienda = idTienda;
		this.nombre = nombre;
		this.activo = activo;
		this.descripcion = descripcion;
		this.foto = foto;
		this.idDireccion = idDireccion;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	
	
	
	
}
