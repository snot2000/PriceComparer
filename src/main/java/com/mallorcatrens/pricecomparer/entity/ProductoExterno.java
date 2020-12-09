package com.mallorcatrens.pricecomparer.entity;

import java.io.Serializable;

public class ProductoExterno implements Serializable{

	

	private static final long serialVersionUID = 159104799105215205L;

	private int idProductoExterno;
	private int idUrlProducto;
	private String referenciaFabricante;
	private String referenciaTienda;
	private String nombre;
	private String descripcion;
	private String foto;
	private String fabricante;
	private String idFabricanteWeb;
	
	
	
	public ProductoExterno() {
		super();
	}
	
	
	public ProductoExterno(int idProductoExterno, int idUrlProducto, String referenciaFabricante,
			String referenciaTienda, String nombre, String descripcion, String foto, String fabricante, String idFabricanteWeb) {
		super();
		this.idProductoExterno = idProductoExterno;
		this.idUrlProducto = idUrlProducto;
		this.referenciaFabricante = referenciaFabricante;
		this.referenciaTienda = referenciaTienda;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.foto = foto;
		this.fabricante = fabricante;
		this.idFabricanteWeb = idFabricanteWeb;
	}
	public int getIdProductoExterno() {
		return idProductoExterno;
	}
	public void setIdProductoExterno(int idProductoExterno) {
		this.idProductoExterno = idProductoExterno;
	}
	public int getIdUrlProducto() {
		return idUrlProducto;
	}
	public void setIdUrlProducto(int idUrlProducto) {
		this.idUrlProducto = idUrlProducto;
	}
	public String getReferenciaFabricante() {
		return referenciaFabricante;
	}
	public void setReferenciaFabricante(String referenciaFabricante) {
		this.referenciaFabricante = referenciaFabricante;
	}
	public String getReferenciaTienda() {
		return referenciaTienda;
	}
	public void setReferenciaTienda(String referenciaTienda) {
		this.referenciaTienda = referenciaTienda;
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
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getIdFabricanteWeb() {
		return idFabricanteWeb;
	}
	public void setIdFabricanteWeb(String idFabricanteWeb) {
		this.idFabricanteWeb = idFabricanteWeb;
	}


	@Override
	public String toString() {
		return "ProductoExterno [idProductoExterno=" + idProductoExterno + ", idUrlProducto=" + idUrlProducto
				+ ", referenciaFabricante=" + referenciaFabricante + ", referenciaTienda=" + referenciaTienda
				+ ", nombre=" + nombre + ", descripcion=" + descripcion + ", foto=" + foto + ", fabricante="
				+ fabricante + ", idFabricanteWeb=" + idFabricanteWeb + "]";
	}
	
	
	
}
