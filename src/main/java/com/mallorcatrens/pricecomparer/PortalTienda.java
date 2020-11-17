package com.mallorcatrens.pricecomparer;

public class PortalTienda {

	String idPortalTienda;
	String Nombre;
	String urlBase;
	
	
	
	
	public PortalTienda(String idPortalTienda, String nombre, String urlBase) {
		super();
		this.idPortalTienda = idPortalTienda;
		Nombre = nombre;
		this.urlBase = urlBase;
	}
	
	public String getIdPortalTienda() {
		return idPortalTienda;
	}
	public void setIdPortalTienda(String idPortalTienda) {
		this.idPortalTienda = idPortalTienda;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getUrlBase() {
		return urlBase;
	}
	public void setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}
	
	
	
}
