package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import com.mallorcatrens.pricecomparer.entity.Rastreador;

public interface RastreadorService {

	
	public Rastreador getRastreador(final int idRastreador);
	public List<Rastreador> getRastreadores();
	public Rastreador setRastreador(Rastreador rastreador);
	public Rastreador updateRastreador(Rastreador rastreador);
	public int deleteRastreador(int idRastreador);
}
