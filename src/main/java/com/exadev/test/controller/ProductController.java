package com.exadev.test.controller;

import com.exadev.test.model.Destination;
import com.exadev.test.model.Product;
import com.exadev.test.model.User;
import com.exadev.test.service.ProductService;
import com.exadev.test.service.UserService;
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
    @GetMapping("/{type}")
    public List<Product> getProductByType (@PathVariable String type){
      return productService.getProductByType(type);
    }
    @PostMapping("")
    public Product createProduct (@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Product product ){
        productService.delete(product);
    }
    @PutMapping("")
    public Product update (@RequestBody Product product){
        return productService.update(product);
    }



}
