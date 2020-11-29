package com.mallorcatrens.pricecomparer.entity;

import java.io.Serializable;
import java.sql.Date;

public class UrlProducto implements Serializable{

	
	private static final long serialVersionUID = -9009623596952101886L;

	private int idUrlProducto;
	private int idPortal;
	private String url;
	private Date fechaAlta;
	
	public UrlProducto() {
		super();
	}

	public UrlProducto(int idUrlProducto, int idPortal, String url, Date fechaAlta) {
		super();
		this.idUrlProducto = idUrlProducto;
		this.idPortal = idPortal;
		this.url = url;
		this.fechaAlta = fechaAlta;
	}

	public int getIdUrlProducto() {
		return idUrlProducto;
	}

	public void setIdUrlProducto(int idUrlProducto) {
		this.idUrlProducto = idUrlProducto;
	}

	public int getIdPortal() {
		return idPortal;
	}

	public void setIdPortal(int idPortal) {
		this.idPortal = idPortal;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	
}
