package com.exadev.test.service;

import com.exadev.test.model.OrderedAmountPreProduct;

import com.exadev.test.model.Product;
import com.exadev.test.repo.AmountRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AmountService {
    private final AmountRepo amountRepo;
    public OrderedAmountPreProduct createAmount(OrderedAmountPreProduct orderedAmountPreProduct){
        return amountRepo.save(orderedAmountPreProduct) ;   }

    public OrderedAmountPreProduct update(OrderedAmountPreProduct orderedAmountPreProduct){
        return amountRepo.save(orderedAmountPreProduct);
    }
    public void deleteById(Long id){
        amountRepo.deleteById(id);
    }
    public Optional<OrderedAmountPreProduct> getAmountById (Long id){
        return amountRepo.findById(id);
    }
    public List<OrderedAmountPreProduct> getAllAmount (){
        return amountRepo.findAll();
    }
    public OrderedAmountPreProduct getAmountByProductId (Long id){
            return amountRepo.getAmountByProductId(id);
    }


}
//nejem nasna3 classe fil model w na3mlelha controlleur ma8ir mana3mlilha service nwali fil controlleur n3ayet lil les fonctions mta3 repo moch mta3 service .
//moch lezim 3liya na3mel les crud l kol (crud(create,read=get,u=update,delete) fi wist kol service c'est pas obligatoire.
// t9oli 3lech man5arjouch prix comme etant classe wa7adha fil model kima fazet l couleur car tout simplement s3ib nal9a 2 produit 3andhom meme prix 5ater l'intervalle mta3 prix kbir barcha donc proba dh3ifa inou 2 produits 3andhom meme prix par contre l'intervalle mta3 couleur s8ir ( yit3adou 3a sweba3 lalwen) donc najmou n5arjouh wa7dou couleur comme etant classe.