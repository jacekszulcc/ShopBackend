package cc.szulc.shop.category.model;

import cc.szulc.shop.product.controller.dto.ProductListDto;
import org.springframework.data.domain.Page;

public record CategoryProductsDto(Category category, Page<ProductListDto> products) {
}
