package com.mallorcatrens.pricecomparer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class apiTienda {

	Logger logger = LoggerFactory.getLogger(apiTienda.class);
	
	@RequestMapping(value="/portaltienda", method=RequestMethod.GET)
	public PortalTienda getById(){
		logger.debug("LogerDebug");
		logger.error("LogerError");
		logger.trace("LogerTrace");
		logger.warn("LogerWarn");
		logger.info("LogerInfo");
        return new PortalTienda("IdTienda", "Nombre", "url");
    }
	
	
}
