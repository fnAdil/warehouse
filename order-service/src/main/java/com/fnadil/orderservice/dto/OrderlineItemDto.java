package com.fnadil.orderservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
public class OrderlineItemDto {
    private Long  id;
    private String skuCode;
    private BigDecimal price;
    private int quantity;

}
