package com.exadev.test.repo;
;
import com.exadev.test.model.Product;
import com.exadev.test.model.Promotion;
import jdk.jfr.Percentage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepo extends JpaRepository<Promotion,Long> {
    List<Promotion> getPromotionsByPercentage (int Percentage); // j'ai mis List par ce que j'ai pas mis unique percentage si j'ai mis unique dans la classe Promotion 3al percentage nwali man7otech list
    Promotion getPromotionByProductId(Long id);
}
