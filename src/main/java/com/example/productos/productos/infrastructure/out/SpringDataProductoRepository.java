package com.example.productos.productos.infrastructure.out;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.productos.productos.domain.entity.Producto;

public interface SpringDataProductoRepository extends JpaRepository<Producto, Long> {
}
