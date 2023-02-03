package cc.szulc.shop.category.service;

import cc.szulc.shop.category.model.Category;
import cc.szulc.shop.category.model.CategoryProductsDto;
import cc.szulc.shop.category.repository.CategoryRepository;
import cc.szulc.shop.product.model.Product;
import cc.szulc.shop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Transactional(readOnly = true)
    public CategoryProductsDto getCategoriesWithProducts(String slug, Pageable pageable) {
        Category category = categoryRepository.findBySlug(slug);
        Page<Product> page = productRepository.findByCategoryId(category.getId(), pageable);
        return new CategoryProductsDto(category, page);
    }
}
