package cc.szulc.shop.cart.controller;

import cc.szulc.shop.cart.controller.dto.CartSummaryDto;
import cc.szulc.shop.cart.controller.mapper.CartMapper;

import cc.szulc.shop.cart.model.dto.CartProductDto;
import cc.szulc.shop.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/{id}")
    public CartSummaryDto getCart(@PathVariable Long id){
        return CartMapper.mapToCartSummary(cartService.getCart(id));
    }

    @PutMapping("/{id}")
    public CartSummaryDto addProductToCart(@PathVariable Long id, @RequestBody CartProductDto cartProductDto){
        return CartMapper.mapToCartSummary(cartService.addProductToCart(id, cartProductDto));
    }
}
