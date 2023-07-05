package com.cooweb.dao;

import java.util.List;

import com.cooweb.models.Producto;

import jakarta.transaction.Transactional;

@Transactional
public interface ProductoDao {

    List<Producto> obtenerProductos();
}
