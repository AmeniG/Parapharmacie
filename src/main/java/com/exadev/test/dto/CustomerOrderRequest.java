package com.exadev.test.dto;

import com.exadev.test.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrderRequest {

    private String destination ;
    private User user ;
    List<OrderedAmountPreProductRequest> orderedAmountPreProductRequestList ;
}
