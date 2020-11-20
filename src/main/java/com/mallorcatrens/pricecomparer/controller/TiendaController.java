package com.mallorcatrens.pricecomparer.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mallorcatrens.pricecomparer.apiTienda;
import com.mallorcatrens.pricecomparer.entity.Tienda;
import com.mallorcatrens.pricecomparer.service.TiendaService;




@Controller
public class TiendaController {

	Logger logger = LoggerFactory.getLogger(apiTienda.class);
	
	@Autowired
    private TiendaService tiendaService;

	
	@RequestMapping(value = "/api/tienda", method=RequestMethod.GET,produces="application/json")
	public List<Tienda> getTiendas() {
		logger.debug("/api/tienda");
		return tiendaService.getTiendas();
	}
	
    @RequestMapping(value = "/api/tienda/{id}", method=RequestMethod.GET,produces="application/json")
    public Tienda getTienda(String id) {
    	logger.debug("recuperado: " + id);
    	logger.debug("/api/tienda/" + id);
        return tiendaService.getTienda( Integer.parseInt(id));
    }
}
