package com.exadev.test.controller;

import com.exadev.test.model.Product;
import com.exadev.test.model.Promotion;
import com.exadev.test.service.PromotionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/promotion")
@AllArgsConstructor
public class PromotionController {
    private final PromotionService promotionService;
    @GetMapping("")
    public List<Promotion> getAllPromotions() {
        return promotionService.getAllProduct();
    }
    @GetMapping("/{id}")
    public Optional<Promotion> getPromotionById(@PathVariable Long id){
        return promotionService.getPromotionById(id);
    }

    @GetMapping("/percentage/{percentage}")
    public List<Promotion> getPromotionByPercentage (@PathVariable int percentage){
        return promotionService.getPromotionsByPercentage(percentage);
    }
    @GetMapping("/product/{id}") // ce qui est entre {} c'est un parametre si je met pas acolade sa devient un nom
    public Promotion getPromotionByProductId (@PathVariable Long id){ // j'ai pas le droit de mettre avec Path variable un objet par exemple @Pathvariable Product product
        return promotionService.getPromotionByProductId(id);
    }
    @PostMapping("") // quand je mets dans le body promotion je peux ne pas mettre id
    public Promotion createPromotion (@RequestBody Promotion promotion){
        return promotionService.createPromotion(promotion);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id  ) {
        promotionService.deleteById(id);
    }
    @PutMapping("")
    public Promotion update (@RequestBody Promotion promotion){ // quand je met PutMapping je dois mettre dans le body pour l'objet promotion son id
        return promotionService.update(promotion);
    }
}
