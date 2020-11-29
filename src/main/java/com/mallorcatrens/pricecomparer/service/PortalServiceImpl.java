package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mallorcatrens.pricecomparer.entity.Portal;
import com.mallorcatrens.pricecomparer.mapper.PortalMapper;

@Service
public class PortalServiceImpl implements PortalService {

	Logger logger = LoggerFactory.getLogger(PortalServiceImpl.class);
	
	@Autowired
    private PortalMapper portalMapper;
	
	@Override
	public Portal getPortal(int idPortal) {
		return portalMapper.selectOne(idPortal);
	}

	@Override
	public List<Portal> getPortalesTienda(int idTienda) {
		
		return portalMapper.selectByTienda(idTienda);

	}

	@Override
	public List<Portal> getPortales() {
		return portalMapper.findAll();
	}

	@Override
	public int insertaPortal(Portal portal) {
		Long idPortal = portalMapper.insertPortal(portal);
		return idPortal.intValue();
	}

}
