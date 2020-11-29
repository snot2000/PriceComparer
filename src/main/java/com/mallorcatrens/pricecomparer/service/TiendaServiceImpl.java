package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mallorcatrens.pricecomparer.apiTienda;
import com.mallorcatrens.pricecomparer.entity.Tienda;
import com.mallorcatrens.pricecomparer.mapper.TiendaMapper;

@Service
public class TiendaServiceImpl implements  TiendaService{
	
	Logger logger = LoggerFactory.getLogger(TiendaServiceImpl.class);
	
	
	@Autowired
    private TiendaMapper tiendaMapper;

    @Override
    public Tienda getTienda(final int id) {
    	
    	Tienda tienda = tiendaMapper.selectOne(id); 
    	logger.trace(tienda.toString());
        return tienda;
    }

    @Override
    public List<Tienda> getTiendas() {
        
    	return tiendaMapper.findAll();
        
    }
	

}
