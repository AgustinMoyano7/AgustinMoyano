package com.cooweb.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cooweb.models.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductoDaoImp implements ProductoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Producto> obtenerProductos() {
        String query = "FROM Producto";
        return entityManager.createQuery(query).getResultList();
    }

}
