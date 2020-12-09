package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mallorcatrens.pricecomparer.entity.ProductoExterno;
import com.mallorcatrens.pricecomparer.mapper.ProductoExternoMapper;

public class ProductoExternoServiceImpl implements ProductoExternoService{

	Logger logger = LoggerFactory.getLogger(ProductoExternoServiceImpl.class);
	
	@Autowired
    private ProductoExternoMapper productoExternoMapper;
	
	
	@Override
	public ProductoExterno selectOne(int idProductoExterno) {
		return productoExternoMapper.selectOne(idProductoExterno);
	}

	@Override
	public List<ProductoExterno> selectByUrlProducto(int idUrlProducto) {
		return productoExternoMapper.selectByUrlProducto(idUrlProducto);
	}

	@Override
	public List<ProductoExterno> findAll() {
		return productoExternoMapper.findAll();
	}

	@Override
	public long insertProductoExterno(ProductoExterno productoExterno) {
		return productoExternoMapper.insertProductoExterno(productoExterno);
	}

	@Override
	public void updateProductoExterno(ProductoExterno productoExterno) {
		productoExternoMapper.updateProductoExterno(productoExterno);		
	}
	

}
