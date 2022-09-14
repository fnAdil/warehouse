package com.fnadil.orderservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fnadil.orderservice.dto.OrderRequest;
import com.fnadil.orderservice.dto.OrderlineItemDto;
import com.fnadil.orderservice.model.Order;
import com.fnadil.orderservice.model.OrderLineItem;
import com.fnadil.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItem> orderLineItems = orderRequest.getOrderLineItemDtoList().stream()
                .map(this::orderLineItemDtoListMapper).toList();
        order.setOrderLineItems(orderLineItems);
        
        orderRepository.save(order);

    }

    private OrderLineItem orderLineItemDtoListMapper(OrderlineItemDto orderLineItemDto) {
        OrderLineItem orderLineItem = new OrderLineItem();
        orderLineItem.setPrice(orderLineItemDto.getPrice());
        orderLineItem.setQuantity(orderLineItemDto.getQuantity());
        orderLineItem.setSkuCode(orderLineItem.getSkuCode());

        return orderLineItem;
    }

}
