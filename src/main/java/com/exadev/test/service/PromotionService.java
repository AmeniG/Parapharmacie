package com.exadev.test.service;

import com.exadev.test.model.Product;
import com.exadev.test.model.Promotion;
import com.exadev.test.repo.PromotionRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class PromotionService {
    private final PromotionRepo promotionRepo;
    public Promotion createPromotion (Promotion promotion){


        return promotionRepo.save(promotion);
    }
    public List<Promotion> getPromotionsByPercentage (int percentage){
        return promotionRepo.getPromotionsByPercentage(percentage);
    }
    public Promotion getPromotionByProductId (Long id){
        return promotionRepo.getPromotionByProductId(id);
    }
    public Optional<Promotion> getPromotionById(Long id){
        return promotionRepo.findById(id);
    }
    public List<Promotion> getAllProduct(){
        return promotionRepo.findAll();
    }
    public void deleteById (Long id){
        promotionRepo.deleteById(id);
    }
    public Promotion update(Promotion promotion){
        return promotionRepo.save(promotion);
    }
}
