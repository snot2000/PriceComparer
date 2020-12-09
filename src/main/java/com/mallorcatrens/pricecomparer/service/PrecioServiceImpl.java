package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mallorcatrens.pricecomparer.entity.Precio;
import com.mallorcatrens.pricecomparer.mapper.PrecioMapper;

@Service
public class PrecioServiceImpl implements PrecioService{

Logger logger = LoggerFactory.getLogger(PrecioServiceImpl.class);
	
	@Autowired
    private PrecioMapper precioMapper;
	
	
	
	@Override
	public Precio selectOne(int idPrecio) {
		return precioMapper.selectOne(idPrecio);
	}

	@Override
	public List<Precio> selectByProductoExterno(int idProductoExterno) {
		return precioMapper.selectByProductoExterno(idProductoExterno);
	}

	@Override
	public List<Precio> findAll() {
		return precioMapper.findAll();
	}

	@Override
	public long insertPrecio(Precio precio) {
		return precioMapper.insertPrecio(precio);
	}

	@Override
	public void updatePrecio(Precio precio) {
		precioMapper.updatePrecio(precio);
	}

}
