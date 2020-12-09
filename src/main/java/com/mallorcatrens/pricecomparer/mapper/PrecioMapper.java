package com.mallorcatrens.pricecomparer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mallorcatrens.pricecomparer.entity.Precio;

@Mapper
public interface PrecioMapper {

	
	
	@Results({
	    @Result(property = "idPrecio", column = "id_precio"),
	    @Result(property = "idProductoExterno", column = "id_producto_externo"),
	    @Result(property = "fecha", column = "fecha"),
	    @Result(property = "precio", column = "precio"),
	    @Result(property = "oferta", column = "oferta"),
	    @Result(property = "precioOferta", column = "precio_oferta")
	})
	
	@Select("SELECT id_precio, id_producto_externo, fecha, precio, oferta, precio_oferta FROM pricecompare.precio WHERE id_precio = #{idPrecio}")
	Precio selectOne(int idPrecio);
	
	@Select("SELECT id_precio, id_producto_externo, fecha, precio, oferta, precio_oferta FROM pricecompare.precio WHERE id_producto_externo = #{idProductoExterno}")
	List<Precio> selectByProductoExterno(int idProductoExterno);

    @Select("SELECT id_precio, id_producto_externo, fecha, precio, oferta, precio_oferta FROM pricecompare.precio ")
    List<Precio> findAll();
    
    @Insert("INSERT into pricecompare.precio(id_producto_externo, fecha, precio, oferta, precio_oferta) VALUES(#{idProductoExterno}, #{fecha}, #{precio}, #{oferta}, #{precioOferta})")
    long insertPrecio(Precio precio);
	
    
    @Update("UPDATE pricecompare.precio SET fecha=#{fecha}, precio=#{precio}, oferta=#{oferta}, precioOferta=#{precioOferta} WHERE id_precio=#{idPrecio}")
    void updatePrecio(Precio precio);
    
}
