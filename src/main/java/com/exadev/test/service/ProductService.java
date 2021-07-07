package com.exadev.test.service;

import com.exadev.test.model.Product;
import com.exadev.test.model.User;
import com.exadev.test.repo.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;
    public Product createProduct (Product product){

        return productRepo.save(product);
    }
    public List<Product> getProductByName (String name){
        return productRepo.getProductsByName(name);
    }
    public List<Product> getProductByType (String type){
        return productRepo.getProductsByType(type);
    }
    public Optional<Product> getProductById(Long id){
        return productRepo.findById(id);
    }
    public void delete (Product product){
        productRepo.delete(product);
    }
    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }
    public Product update(Product product){
        return productRepo.save(product);
    }
}
