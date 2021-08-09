package com.exadev.test.repo;


import com.exadev.test.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoryRepo  extends JpaRepository<Category,Long> {
    Category getCategoryByCode(String code);// ne pas mettre getcategorysbyCode avec s càd car  chaque code a un seul category par contre si j'ai mis list<Category> sa devient getcategoriesbycode avec s cad
    Category getCategoryByDescription(String Description);


}
// fil repo houwa ya3tini asemi les fonctions par contre fil service et controlleurs ena nsami 3la kifi mais de préference sami de la facon ili samit biha ena significatif comme ca.
