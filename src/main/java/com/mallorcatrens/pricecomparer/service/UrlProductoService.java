package com.mallorcatrens.pricecomparer.service;

import java.util.List;
import com.mallorcatrens.pricecomparer.entity.UrlProducto;

public interface UrlProductoService {

	public UrlProducto getUrlProducto(int idUrlProducto);
    public List<UrlProducto> findAll();
    public List<UrlProducto> findByPortal(int idPortal);
	
	
}
