package com.exadev.test.controller;

import com.exadev.test.model.Category;
import com.exadev.test.service.CategoryService;
import lombok.AllArgsConstructor;
import org.apache.el.stream.Optional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")

@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping("")//valid
    public Category createCategory (@RequestBody Category category){
        return categoryService.createCategory(category);
    }
    @DeleteMapping("/{id}")//valid
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
    }
    @PutMapping("")//valid
    public Category updateCategory (@RequestBody Category category){
        return categoryService.updateCategory(category);
    }
    @GetMapping("/{id}")//valid
    public Category getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }

    @GetMapping("")//valid
    public List<Category> getAllCategories(){
        return categoryService.getAllCategory();
    }
    @GetMapping("/{name}")//valid
    public Category getCategoryByCode(@PathVariable String code){
        return categoryService.getCategoryByCode(code);
    }
    @GetMapping("/{description}")
    public Category getCategoryByDescription(@PathVariable String description){
        return categoryService.getCategoryByDescription(description);
    }

}
