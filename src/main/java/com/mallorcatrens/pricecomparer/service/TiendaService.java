package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import com.mallorcatrens.pricecomparer.entity.Tienda;

public interface TiendaService {

	public Tienda getTienda(final int id);
	public List<Tienda> getTiendas();
	
}
