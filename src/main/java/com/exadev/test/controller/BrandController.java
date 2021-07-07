package com.exadev.test.controller;

import com.exadev.test.model.Brand;
import com.exadev.test.model.User;
import com.exadev.test.service.BrandService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/brand")
@AllArgsConstructor
public class BrandController {
    private final BrandService brandService;
    @GetMapping("")
    public List<Brand> getAllBrand (){
        return brandService.getAllBrand();
    }
    @GetMapping("{id}")
    public Optional<Brand> getBrandById (@PathVariable Long id){
        return brandService.getBrandById(id);
    }
    @GetMapping ("{name}")
    public Brand getBrandByName (@PathVariable String name){
        return brandService.getBrandByName(name);
    }

    @PostMapping("")
    public Brand createBrand (@RequestBody Brand brand){
        return brandService.createBrand(brand);
    }
    @PutMapping("")
    public Brand update (@RequestBody Brand brand){
        return brandService.update(brand);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id ){
        brandService.deleteById(id);
    }

}
