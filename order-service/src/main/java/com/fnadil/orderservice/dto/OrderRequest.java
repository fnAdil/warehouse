package com.fnadil.orderservice.dto;

import java.util.List;

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
public class OrderRequest {
    private List<OrderlineItemDto> orderLineItemDtoList;
    
}
