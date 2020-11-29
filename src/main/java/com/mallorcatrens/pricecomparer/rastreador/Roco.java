package com.mallorcatrens.pricecomparer.rastreador;

import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Roco implements RastreadorInt {

	
	Logger logger = LoggerFactory.getLogger(Roco.class);
	
	
	@Override
	public void recuperaInformacionProducto(URL url) {
		logger.debug("Vamos a revisar la url " + url);
	}

}
