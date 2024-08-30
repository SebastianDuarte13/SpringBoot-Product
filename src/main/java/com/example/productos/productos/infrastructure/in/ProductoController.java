package com.example.productos.productos.infrastructure.in;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productos.productos.application.ProductoService;
import com.example.productos.productos.domain.entity.Producto;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*") // Permite el acceso desde cualquier origen (Frontend)
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto addProducto(@RequestBody Producto producto) {
        return productoService.addProducto(producto);
    }

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }
}
