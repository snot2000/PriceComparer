package com.mallorcatrens.pricecomparer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mallorcatrens.pricecomparer.apiTienda;
import com.mallorcatrens.pricecomparer.entity.Tienda;
import com.mallorcatrens.pricecomparer.service.TiendaService;




@RestController
@RequestMapping("/api/tienda")
public class TiendaController {

	Logger logger = LoggerFactory.getLogger(apiTienda.class);
	
	@Autowired
    private TiendaService tiendaService;

	
	@RequestMapping(value = "/", method=RequestMethod.GET,produces="application/json")
	public synchronized ResponseEntity<?> getTiendas() {
		logger.debug("/api/tienda");
		return new ResponseEntity<>(tiendaService.getTiendas(), HttpStatus.OK);
	}
	
    @RequestMapping(value = {"/{idTienda}"},  method=RequestMethod.GET, produces="application/json")
    public synchronized ResponseEntity<?> getTienda(@PathVariable(value = "idTienda") String idTienda ,HttpServletRequest request) {
    	logger.debug("recuperado: " + idTienda);
    	logger.debug("/api/tienda/" + idTienda);
        return new ResponseEntity<>(tiendaService.getTienda( Integer.parseInt(idTienda)), HttpStatus.OK);
        		
    }
}
