package com.example.productos.productos.domain.service;

import java.util.List;

import com.example.productos.productos.domain.entity.Producto;

public interface ProductoRepository {
    Producto save(Producto producto);
    List<Producto> findAll();
}
