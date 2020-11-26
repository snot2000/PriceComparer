package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mallorcatrens.pricecomparer.entity.Rastreador;
import com.mallorcatrens.pricecomparer.mapper.RastreadorMapper;


@Service
public class RastreadorServiceImpl implements RastreadorService {

	
Logger logger = LoggerFactory.getLogger(RastreadorServiceImpl.class);
	
	
	@Autowired
    private RastreadorMapper rastreadorMapper;
	
	
	
	@Override
	public Rastreador getRastreador(int idRastreador) {
		return rastreadorMapper.selectOne(idRastreador);
	}

	@Override
	public List<Rastreador> getRastreadores() {
		return rastreadorMapper.findAll();
	}

	@Override
	public Rastreador setRastreador(Rastreador rastreador) {
		rastreadorMapper.insertRastreador(rastreador);
		
		return rastreador;
	}

	@Override
	public Rastreador updateRastreador(Rastreador rastreador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteRastreador(int idRastreador) {
		// TODO Auto-generated method stub
		return 0;
	}

}
