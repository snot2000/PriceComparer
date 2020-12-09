package com.mallorcatrens.pricecomparer.rastreador;

import java.io.IOException;
import java.net.URL;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mallorcatrens.pricecomparer.entity.ProductoExterno;
import com.mallorcatrens.pricecomparer.entity.UrlProducto;


public class Roco implements RastreadorInt {

	
	Logger logger = LoggerFactory.getLogger(Roco.class);
	
	
	@Override
	public void recuperaInformacionProducto(UrlProducto urlProducto) {
		
		
		try {
			
			URL url = new URL(urlProducto.getUrl());
			
			logger.debug("Vamos a revisar la url " + url);
			
			Document doc = Jsoup.connect(url.toString()).userAgent("Mozilla/5.0").timeout(100000).validateTLSCertificates(false).ignoreHttpErrors(true).get();
			Elements tablas = doc.getElementById("ID_MODELL_HEADER").select("table");
			
			String codigoProducto = tablas.get(0).select("h1").text().split("-")[0];
			String nombreProducto = tablas.get(0).select("h1").text().split("-")[1];
			
			
			Elements precio = doc.getElementsByClass("ModPrice fOrange");
			if (precio != null) logger.debug(precio.text());
			
			logger.debug(codigoProducto);
			logger.debug(nombreProducto);
			
			ProductoExterno productoExterno = new ProductoExterno();
			/*productoExterno.setIdProductoExterno(idProductoExterno);
			productoExterno.setIdUrlProducto(idUrlProducto);
			productoExterno.setDescripcion(descripcion);
			productoExterno.setFabricante(fabricante);
			productoExterno.setFoto(foto);
			productoExterno.setIdFabricanteWeb(idFabricanteWeb);						
			productoExterno.setNombre(nombre);
			productoExterno.setReferenciaFabricante(referenciaFabricante);
			productoExterno.setReferenciaTienda(referenciaTienda);*/
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
