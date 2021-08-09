package com.exadev.test.controller;

import com.exadev.test.model.OrderedAmountPreProduct;


import com.exadev.test.model.Product;
import com.exadev.test.service.AmountService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/amountController")
@AllArgsConstructor
public class AmountController {
    private final AmountService amountService;
    @GetMapping("")
    public List<OrderedAmountPreProduct> getAllAmount (){
        return amountService.getAllAmount();
    }
    @GetMapping("{id}")
    public Optional<OrderedAmountPreProduct> getAmountById (@PathVariable Long id){
        return amountService.getAmountById(id);
    }
    @PostMapping("")
    public OrderedAmountPreProduct createAmount (@RequestBody OrderedAmountPreProduct orderedAmountPreProduct){
        return amountService.createAmount(orderedAmountPreProduct);
    }
    @PutMapping("")
    public OrderedAmountPreProduct update (@RequestBody OrderedAmountPreProduct orderedAmountPreProduct){
        return amountService.update(orderedAmountPreProduct);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id ){
        amountService.deleteById(id);}
   @GetMapping("/product/{id}")
    public OrderedAmountPreProduct getAmountByProductId(@PathVariable Long id){
        return amountService.getAmountByProductId(id);
   }

}
//tjrs avec getmapping on met path variable par contre avec deletemapping , putmapping postmapping .. najmou n7otou path ou requestbody