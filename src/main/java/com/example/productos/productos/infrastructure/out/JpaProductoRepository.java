package com.example.productos.productos.infrastructure.out;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.productos.productos.domain.entity.Producto;
import com.example.productos.productos.domain.service.ProductoRepository;

@Repository
public class JpaProductoRepository implements ProductoRepository {
    @Autowired
    private SpringDataProductoRepository repository;

    @Override
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }
}
