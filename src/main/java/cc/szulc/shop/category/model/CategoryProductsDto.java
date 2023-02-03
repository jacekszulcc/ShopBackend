package cc.szulc.shop.category.model;

import cc.szulc.shop.product.model.Product;
import org.springframework.data.domain.Page;

public record CategoryProductsDto(Category category, Page<Product> products) {
}
