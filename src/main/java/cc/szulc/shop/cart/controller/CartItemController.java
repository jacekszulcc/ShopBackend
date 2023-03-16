package cc.szulc.shop.cart.controller;

import cc.szulc.shop.cart.service.CartItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(("/cartItems"))
@RequiredArgsConstructor
public class CartItemController {

    private final CartItemService cartItemService;

    @DeleteMapping("/{id}")
    public void deleteCartItem(@PathVariable Long id){
        cartItemService.delete(id);
    }

    @GetMapping("/count/{cartId}")
    public Long countItemCart(@PathVariable Long cartId){
        return cartItemService.countItemInCart(cartId);
    }

}
