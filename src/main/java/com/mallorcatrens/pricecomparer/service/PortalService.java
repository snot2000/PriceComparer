package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import com.mallorcatrens.pricecomparer.entity.Portal;

public interface PortalService {

	public Portal getPortal(int idPortal);
	public List<Portal> getPortalesTienda(int idTienda);
	public List<Portal> getPortales();
	public int insertaPortal(Portal portal);
	
}
