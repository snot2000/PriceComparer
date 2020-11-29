package com.mallorcatrens.pricecomparer.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mallorcatrens.pricecomparer.entity.Portal;
import com.mallorcatrens.pricecomparer.service.PortalService;


@RestController
@RequestMapping("/api/portal")
public class PortalController {
	
	Logger logger = LoggerFactory.getLogger(PortalController.class);
	
	@Autowired
    private PortalService portalService;
	
	@RequestMapping(value = "/", method=RequestMethod.GET,produces="application/json")
	public synchronized ResponseEntity<?> getRastreadores() {
		return new ResponseEntity<>(portalService.getPortales(), HttpStatus.OK);
	}
	
	@RequestMapping(value = {"/{idPortal}"},  method=RequestMethod.GET, produces="application/json")
    public synchronized ResponseEntity<?> getRastreador(@PathVariable(value = "idPortal") String idPortal ,HttpServletRequest request) {
        return new ResponseEntity<>(portalService.getPortal( Integer.parseInt(idPortal)), HttpStatus.OK);
        		
    }
	
	@RequestMapping(value = "/", method=RequestMethod.POST,produces="application/json")
	public synchronized ResponseEntity<?> setPortal(@RequestBody Portal portal,HttpServletRequest request) {
		portal.setIdPortal(portalService.insertaPortal(portal));
		return new ResponseEntity<>(portal, HttpStatus.OK);
	}
	

}
