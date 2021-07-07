package com.exadev.test.service;

import com.exadev.test.model.Brand;
import com.exadev.test.model.User;
import com.exadev.test.repo.BrandRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BrandService {
    private final BrandRepo brandRepo;
    public Brand createBrand(Brand brand ){ // samiha ce que tu veux cette fonction pas comme dans repo mais juste on a choisit createbrand comme nom significatif
        return brandRepo.save(brand);
    }
    public Brand getBrandByName (String name){
        return brandRepo.getBrandByName(name);
    }
    public Optional<Brand> getBrandById (Long id){
        return brandRepo.findById(id); // si j'ai mis getById non pas findById je met pas optional <brand> je met juste Brand
    }
    public List<Brand> getAllBrand (){
        return brandRepo.findAll();
    }
    public Brand update(Brand brand){
        return brandRepo.save(brand);
    }
    public void deleteById(Long id){
        brandRepo.deleteById(id);
    }
}
