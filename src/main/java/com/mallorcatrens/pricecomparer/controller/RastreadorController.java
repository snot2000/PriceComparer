package com.mallorcatrens.pricecomparer.controller;

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

import com.mallorcatrens.pricecomparer.service.RastreadorService;

@RestController
@RequestMapping("/api/rastreador")
public class RastreadorController {
	
	
Logger logger = LoggerFactory.getLogger(RastreadorController.class);
	
	@Autowired
    private RastreadorService rastreadorService;

	
	@RequestMapping(value = "/", method=RequestMethod.GET,produces="application/json")
	public synchronized ResponseEntity<?> getRastreadores() {
		return new ResponseEntity<>(rastreadorService.getRastreadores(), HttpStatus.OK);
	}
	
    @RequestMapping(value = {"/{idRastreador}"},  method=RequestMethod.GET, produces="application/json")
    public synchronized ResponseEntity<?> getRastreador(@PathVariable(value = "idRastreador") String idRastreador ,HttpServletRequest request) {
        return new ResponseEntity<>(rastreadorService.getRastreador( Integer.parseInt(idRastreador)), HttpStatus.OK);
        		
    }
    
    @RequestMapping(value = "/", method=RequestMethod.POST,produces="application/json")
	public synchronized ResponseEntity<?> setRastreador(HttpServletRequest request) {
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
    
    
    @RequestMapping(value = "/", method=RequestMethod.PUT,produces="application/json")
	public synchronized ResponseEntity<?> updateRastreador(HttpServletRequest request) {
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
    
    
    @RequestMapping(value = "/{idRastreador}", method=RequestMethod.DELETE,produces="application/json")
	public synchronized ResponseEntity<?> deleteRastreador(@PathVariable(value = "idRastreador") String idRastreador ,HttpServletRequest request) {
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
    
    

}
