package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mallorcatrens.pricecomparer.entity.UrlProducto;
import com.mallorcatrens.pricecomparer.mapper.UrlProductoMapper;


@Service
public class UrlProductoServiceImpl implements UrlProductoService{

	Logger logger = LoggerFactory.getLogger(UrlProductoServiceImpl.class);
	
	
	@Autowired
    private UrlProductoMapper urlProductoMapper;
	
	@Override
	public UrlProducto getUrlProducto(int idUrlProducto) {
		return urlProductoMapper.getUrlProducto(idUrlProducto);
	}

	@Override
	public List<UrlProducto> findAll() {
		return urlProductoMapper.findAll();
	}

	@Override
	public List<UrlProducto> findByPortal(int idPortal) {
		return urlProductoMapper.findByPortal(idPortal);
	}

}
