package com.exadev.test.repo;

import com.exadev.test.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BrandRepo extends JpaRepository<Brand,Long> {
    Brand getBrandByName (String name); // ne pas mettre getbrandsbyname avec s càd car  chaque nom a un seul brand par contre si j'ai mis list<Brand> sa devient gettbrandsbyname avec s cad
}
