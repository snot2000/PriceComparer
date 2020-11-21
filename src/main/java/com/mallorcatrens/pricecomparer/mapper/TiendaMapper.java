package com.mallorcatrens.pricecomparer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mallorcatrens.pricecomparer.entity.Tienda;

@Mapper
public interface TiendaMapper {

	
	@Select("SELECT id_tienda as idTienda, nombre as nombre, activo as activo FROM pricecompare.tienda WHERE idtienda = #{id}")
    Tienda selectOne(int id);

    @Select("SELECT id_tienda as idTienda, nombre as nombre, activo as activo FROM pricecompare.tienda")
    List<Tienda> findAll();
    
	
	
}
