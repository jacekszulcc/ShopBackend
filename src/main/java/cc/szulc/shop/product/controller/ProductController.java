package cc.szulc.shop.product.controller;

import cc.szulc.shop.product.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        return List.of(
                new Product("New Product 1", "New category 1", "New description 1", new BigDecimal("12.99"), "PLN"),
                new Product("New Product 2", "New category 2", "New description 2", new BigDecimal("13.99"), "PLN"),
                new Product("New Product 3", "New category 3", "New description 3", new BigDecimal("14.99"), "PLN"),
                new Product("New Product 4", "New category 4", "New description 4", new BigDecimal("15.99"), "PLN")
        );
    }
}
