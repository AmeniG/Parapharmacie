package com.exadev.test.service;

import com.exadev.test.model.Category;
import com.exadev.test.repo.CategoryRepo;
import lombok.AllArgsConstructor;
import org.apache.el.stream.Optional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepo categoryRepo;
    public Category createCategory(Category category){
        return categoryRepo.save(category);
    }
    public void deleteCategoryById(Long id){
        categoryRepo.deleteById(id);
    }
    public Category updateCategory(Category category){
        return categoryRepo.save(category);
    }
    public Category getCategoryById(Long id){
        return categoryRepo.findById(id).get();// si j'ai mis getById non pas findById je met pas optional <category> je met juste category et c'est ca la seule diff entre getByid et findByid
    }

    public List<Category> getAllCategory(){
        return categoryRepo.findAll();
    }
    public Category getCategoryByCode(String code){ return categoryRepo.getCategoryByCode(code); }
    public Category getCategoryByDescription(String description){ return categoryRepo.getCategoryByDescription(description); }

}
