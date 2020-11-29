package com.mallorcatrens.pricecomparer.controller;

import java.net.URL;
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

import com.mallorcatrens.pricecomparer.entity.Portal;
import com.mallorcatrens.pricecomparer.entity.Rastreador;
import com.mallorcatrens.pricecomparer.entity.UrlProducto;
import com.mallorcatrens.pricecomparer.rastreador.RastreadorInt;
import com.mallorcatrens.pricecomparer.rastreador.Roco;
import com.mallorcatrens.pricecomparer.service.PortalService;
import com.mallorcatrens.pricecomparer.service.RastreadorService;
import com.mallorcatrens.pricecomparer.service.UrlProductoService;

@RestController
@RequestMapping("/search")
public class SearchController {

	
Logger logger = LoggerFactory.getLogger(SearchController.class);
	
	@Autowired
    private PortalService portalService;
	@Autowired
	private UrlProductoService urlProductoService;
	@Autowired
	private RastreadorService rastreadorService;
	
	
	@RequestMapping(value = "/actualizaportal/{idPortal}", method=RequestMethod.GET,produces="application/json")
	public synchronized ResponseEntity<?> actualizaPortal(@PathVariable(value = "idPortal") String idPortal ,HttpServletRequest request) {
		actualizaUrlPortal(Integer.parseInt(idPortal));
		return new ResponseEntity<>("0", HttpStatus.OK);
    }
	
	
	
	
	
	
	
	
	
	private void actualizaUrlPortal(int idPortal) {
		logger.debug("Vamos a actualizar los datos del portal " + idPortal);
		
		Portal portal = portalService.getPortal(idPortal);
		
		logger.debug("Recuperados datos del portal " + portal);
		
		Rastreador rastreador = rastreadorService.getRastreador(portal.getIdRastreador());
		
		logger.debug("Recuperamos los datos del rastreador " + rastreador);
		
		List<UrlProducto> listaProductos = urlProductoService.findByPortal(idPortal);
		
		logger.debug("Recuperadas URL " + listaProductos.size());
		
		RastreadorInt rastreadorInt = new Roco();
		
		
		for(UrlProducto urlProducto : listaProductos) {
			
			try {
				URL url = new URL(urlProducto.getUrl());
				rastreadorInt.recuperaInformacionProducto(url);
			}catch(Exception e) {
				logger.error("URL incorrecta " + urlProducto.getUrl());
			}
			
			
		}
		
		
		
		
	}
}
