package com.mallorcatrens.pricecomparer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mallorcatrens.pricecomparer.entity.Tienda;

@Mapper
public interface TiendaMapper {

	@Results({
	    @Result(property = "idTienda", column = "id_tienda"),
	    @Result(property = "nombre", column = "nombre"),
	    @Result(property = "activo", column = "activo"),
	    @Result(property = "descripcion", column = "descripcion"),
	    @Result(property = "foto", column = "foto"),
	    @Result(property = "idDireccion", column = "id_direccion")
	})
	
	@Select("SELECT id_tienda, nombre, activo, descripcion, foto, id_direccion FROM pricecompare.tienda WHERE id_tienda = #{idTienda}")
    Tienda selectOne(int idTienda);

    @Select("SELECT id_tienda, nombre, activo, descripcion, foto, id_direccion FROM pricecompare.tienda")
    List<Tienda> findAll();
    
	
	
}
