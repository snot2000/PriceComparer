package com.mallorcatrens.pricecomparer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mallorcatrens.pricecomparer.entity.Precio;


public interface PrecioService {

	Precio selectOne(int idPrecio);
	List<Precio> selectByProductoExterno(int idProductoExterno);
    List<Precio> findAll();
    long insertPrecio(Precio precio);
    void updatePrecio(Precio precio);
}
