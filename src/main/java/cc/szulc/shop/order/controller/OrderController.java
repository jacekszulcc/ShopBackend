package cc.szulc.shop.order.controller;

import cc.szulc.shop.order.model.dto.OrderDto;
import cc.szulc.shop.order.model.dto.OrderSummary;
import cc.szulc.shop.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/orders")
    public OrderSummary placeOrder(@RequestBody OrderDto orderDto){
        return orderService.placeOrder(orderDto);
    }

}
