package com.mallorcatrens.pricecomparer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mallorcatrens.pricecomparer.entity.ProductoExterno;

@Mapper
public interface ProductoExternoMapper {

	
	@Results({
	    @Result(property = "idProductoExterno", column = "id_producto_externo"),
	    @Result(property = "idUrlProducto", column = "id_url_producto"),
	    @Result(property = "referenciaFabricante", column = "referencia_fabricante"),
	    @Result(property = "referenciaTienda", column = "referencia_tienda"),
	    @Result(property = "nombre", column = "nombre"),
	    @Result(property = "descripcion", column = "descripcion"),
	    @Result(property = "foto", column = "foto"),
	    @Result(property = "fabricante", column = "fabricante"),
	    @Result(property = "idFabricanteWeb", column = "id_fabricante_web")
	})
	
	@Select("SELECT id_producto_externo, id_url_producto, referencia_fabricante, referencia_tienda, nombre, descripcion, foto, fabricante, id_fabricante_web FROM pricecompare.producto_externo WHERE id_producto_externo = #{idProductoExterno}")
	ProductoExterno selectOne(int idProductoExterno);
	
	@Select("SELECT id_producto_externo, id_url_producto, referencia_fabricante, referencia_tienda, nombre, descripcion, foto, fabricante, id_fabricante_web FROM pricecompare.producto_externo WHERE id_url_producto = #{idUrlProducto}")
	List<ProductoExterno> selectByUrlProducto(int idUrlProducto);

    @Select("SELECT id_producto_externo, id_url_producto, referencia_fabricante, referencia_tienda, nombre, descripcion, foto, fabricante, id_fabricante_web FROM pricecompare.producto_externo ")
    List<ProductoExterno> findAll();
    
    @Insert("INSERT into pricecompare.producto_externo(id_url_producto, referencia_fabricante, referencia_tienda, nombre, descripcion, foto, fabricante, id_fabricante_web) VALUES(#{id_url_producto}, #{referencia_fabricante}, #{referencia_tienda}, #{nombre}, #{descripcion}, #{foto}, #{fabricante}, #{idFabricanteWeb} )")
    long insertProductoExterno(ProductoExterno productoExterno);
	
    @Update("UPDATE pricecompare.precio SET referencia_fabricante=#{referenciaFabricante}, referenciaTienda=#{referencia_tienda}, nombre=#{nombre}, descripcion=#{descripcion}, foto=#{foto}, fabricante=#{fabricante}, id_fabricante_web=#{idFabricanteWeb}  WHERE id_producto_externo=#{idProductoExterno}")
    void updateProductoExterno(ProductoExterno productoExterno);
	
	
}
