package com.exadev.test.controller;

import com.exadev.test.model.Product;
import com.exadev.test.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("")
    public List<Product> getAllProducts() {
        return productService.getAllProduct();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @GetMapping("/{name}")
    public List<Product> getProductByName (@PathVariable String name){
      return productService.getProductByName(name);
    }
    @GetMapping("/{color}")
    public List<Product> getProductsByColor (@PathVariable String color){
        return productService.getProductsByColor(color);
    }
    @GetMapping("/{brand}")
    public List<Product> getProductByBrand (@PathVariable String brand){
        return productService.getProductsByBrand(brand);
    }

    @PostMapping("")
    public Product createProduct (@RequestBody Product product){
        return productService.createProduct(product);
    }



    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id ){
        productService.deleteById(id);
    }
    @PutMapping("")
    public Product update (@RequestBody Product product){
        return productService.update(product);
    }



}
