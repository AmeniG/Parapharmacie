package com.exadev.test.dto;

import com.exadev.test.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderedAmountPreProductRequest {
    private int qte;
    private Product product;
}
