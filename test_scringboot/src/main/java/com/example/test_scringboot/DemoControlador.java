package com.example.test_scringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
@RestController
public class DemoControlador extends SpringBootServletInitializer {
    public static void main(String[] args) {    SpringApplication.run(DemoControlador.class, args);}
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoControlador.class);
    }
    public List<ProductosLimpieza> list_product = new ArrayList<ProductosLimpieza>();

    @GetMapping("/add")
    public String addCustomer() {
        ProductosLimpieza producto1 = new ProductosLimpieza();
        ProductosLimpieza producto2 = new ProductosLimpieza();
        ProductosLimpieza producto3 = new ProductosLimpieza();

        producto1.setId_producto(1);
        producto1.setPrecio(140);
        producto1.setDescripcion("Arroz");
        producto1.setStock(5);

        producto2.setId_producto(2);
        producto2.setPrecio(240);
        producto2.setDescripcion("Fideo Moñito");
        producto2.setStock(10);

        producto3.setId_producto(3);
        producto3.setPrecio(350);
        producto3.setDescripcion("atun");
        producto3.setStock(50);

        list_product.add(producto1);
        list_product.add(producto2);
        list_product.add(producto3);

        return "Se  han  Registrado los productos ";
    }

    @PostMapping("/newProducto")
    public String addProducto(@RequestBody ProductosLimpieza newProducto) {


        list_product.add(newProducto);
    return  "Producto Registrado";

    }

        @GetMapping("/listado_productos")
        public List<ProductosLimpieza> obtenerProductos() {

            ProductosLimpieza producto1 = new ProductosLimpieza();
            ProductosLimpieza producto2 = new ProductosLimpieza();
            ProductosLimpieza producto3 = new ProductosLimpieza();

            producto1.setId_producto(1);
            producto1.setPrecio(140);
            producto1.setDescripcion("Arroz");
            producto1.setStock(5);

            producto2.setId_producto(2);
            producto2.setPrecio(240);
            producto2.setDescripcion("Fideo Moñito");
            producto2.setStock(10);

            producto3.setId_producto(3);
            producto3.setPrecio(350);
            producto3.setDescripcion("atun");
            producto3.setStock(50);

            list_product.add(producto1);
            list_product.add(producto2);
            list_product.add(producto3);

        return  list_product;
        }
}
