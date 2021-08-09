package com.exadev.test.repo;

import com.exadev.test.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
        List<Product> getProductsByName ( String name);

        List<Product> getProductsByColor(String color);
        List<Product> getProductsByBrand (String brand);


}
// dans service on fait l'appel des fonctions qu'on a definit dans repo(exemple getproductsBytype) et l' appel des fonctions qui sont déjà prédefinit dans repo comme delete et getByid(ou getById)..
// on n'a pas fait dans repo getbyid ou delete par exemple car déja cette fonction est prédefinit
// dans controller on fait l'appel des fonctions de service
// ya pas fonctions prédéfinit dans service