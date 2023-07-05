package com.cooweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.ProductoDao;
import com.cooweb.models.Producto;

@RestController
public class ProductoController {

    @Autowired
    private ProductoDao productoDao;

    @RequestMapping(value = "api/productos")
    public List<Producto> obtenerProductos() {
        List<Producto> productos = productoDao.obtenerProductos();
        return productos;
    }

    
}

