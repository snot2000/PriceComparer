package com.mallorcatrens.pricecomparer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mallorcatrens.pricecomparer.entity.UrlProducto;

@Mapper
public interface UrlProductoMapper {

	@Results({
	    @Result(property = "idUrlProducto", column = "id_url_producto"),
	    @Result(property = "idPortal", column = "id_portal"),
	    @Result(property = "url", column = "url"),
	    @Result(property = "fechaAlta", column = "fecha_alta")
	})
	
	
	@Select("SELECT id_url_producto, id_portal, url, fecha_alta FROM pricecompare.url_producto WHERE id_url_producto = #{idUrlProducto}")
    UrlProducto getUrlProducto(int idUrlProducto);

    @Select("SELECT id_url_producto, id_portal, url, fecha_alta FROM pricecompare.url_producto")
    List<UrlProducto> findAll();
    
    @Select("SELECT id_url_producto, id_portal, url, fecha_alta FROM pricecompare.url_producto WHERE id_portal = #{idPortal}")
    List<UrlProducto> findByPortal(int idPortal);
	
}
