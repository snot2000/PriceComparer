package com.mallorcatrens.pricecomparer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.mallorcatrens.pricecomparer.entity.Rastreador;

@Mapper
public interface RastreadorMapper {

	@Results({
	    @Result(property = "idRastreador", column = "id_rastreador"),
	    @Result(property = "nombre", column = "nombre"),
	    @Result(property = "clase", column = "clase"),
	    @Result(property = "activo", column = "activo")
	})
	
	@Select("SELECT id_rastreador as idRastreador, nombre as nombre, clase as clase, activo as activo FROM pricecompare.rastreador WHERE id_rastreador = #{idRastreador}")
    Rastreador selectOne(int idRastreador);

    @Select("SELECT id_rastreador as idRastreador, nombre as nombre, clase as clase, activo as activo FROM pricecompare.rastreador")
    List<Rastreador> findAll();
    
    @Insert("INSERT into village(id_rastreador,nombre,clase,activo) VALUES(#{idRastreador}, #{nombre}, #{clase}, #{activo})")
    void insertRastreador(Rastreador rastreador);
    
	
}
