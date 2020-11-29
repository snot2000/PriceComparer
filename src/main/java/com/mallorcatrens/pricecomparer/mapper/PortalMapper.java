package com.mallorcatrens.pricecomparer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mallorcatrens.pricecomparer.entity.Portal;

@Mapper
public interface PortalMapper {

	@Results({
	    @Result(property = "idPortal", column = "id_portal"),
	    @Result(property = "idTienda", column = "id_tienda"),
	    @Result(property = "urlBase", column = "url_base"),
	    @Result(property = "nombre", column = "nombre"),
	    @Result(property = "descripcion", column = "descripcion"),
	    @Result(property = "activo", column = "activo"),
	    @Result(property = "idRastreador", column = "id_rastreador")
	})
	
	@Select("SELECT id_portal, id_tienda, url_base, nombre, descripcion, activo, id_rastreador FROM pricecompare.portal WHERE id_portal = #{idPortal}")
    Portal selectOne(int idPortal);
	
	@Select("SELECT id_portal, id_tienda, url_base, nombre, descripcion, activo, id_rastreador FROM pricecompare.portal WHERE id_tienda = #{idTienda}")
	List<Portal> selectByTienda(int idTienda);

    @Select("SELECT id_portal, id_tienda, url_base, nombre, descripcion, activo, id_rastreador FROM pricecompare.portal ")
    List<Portal> findAll();
    
    @Insert("INSERT into pricecompare.portal(id_tienda, url_base, nombre, descripcion, activo, id_rastreador) VALUES(#{idTienda}, #{urlBase}, #{nombre}, #{descripcion}, #{activo}, #{idRastreador})")
    long insertPortal(Portal portal);
	    
		
}
