package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import com.mallorcatrens.pricecomparer.entity.ProductoExterno;

public interface ProductoExternoService {

	ProductoExterno selectOne(int idProductoExterno);
	List<ProductoExterno> selectByUrlProducto(int idUrlProducto);
    List<ProductoExterno> findAll();
    long insertProductoExterno(ProductoExterno productoExterno);
    void updateProductoExterno(ProductoExterno productoExterno);
    
}
