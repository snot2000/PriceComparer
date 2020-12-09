package com.mallorcatrens.pricecomparer.entity;

import java.io.Serializable;
import java.sql.Date;

public class Precio implements Serializable{


	private static final long serialVersionUID = 1007451439578759197L;

	private int idPrecio;
	private int idProductoExterno;
	private Date fecha;
	private int precio;
	private String oferta;
	private int precioOferta;
	
	
	public Precio() {
		super();
	}


	public Precio(int idPrecio, int idProductoExterno, Date fecha, int precio, String oferta, int precioOferta) {
		super();
		this.idPrecio = idPrecio;
		this.idProductoExterno = idProductoExterno;
		this.fecha = fecha;
		this.precio = precio;
		this.oferta = oferta;
		this.precioOferta = precioOferta;
	}


	public int getIdPrecio() {
		return idPrecio;
	}


	public void setIdPrecio(int idPrecio) {
		this.idPrecio = idPrecio;
	}


	public int getIdProductoExterno() {
		return idProductoExterno;
	}


	public void setIdProductoExterno(int idProductoExterno) {
		this.idProductoExterno = idProductoExterno;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getOferta() {
		return oferta;
	}


	public void setOferta(String oferta) {
		this.oferta = oferta;
	}


	public int getPrecioOferta() {
		return precioOferta;
	}


	public void setPrecioOferta(int precioOferta) {
		this.precioOferta = precioOferta;
	}
	
	
}
