package cc.szulc.shop.category.dto;

import cc.szulc.shop.common.model.Category;
import cc.szulc.shop.common.dto.ProductListDto;
import org.springframework.data.domain.Page;

public record CategoryProductsDto(Category category, Page<ProductListDto> products) {
}
