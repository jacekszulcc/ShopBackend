package cc.szulc.shop.product.service;

import cc.szulc.shop.product.model.Product;
import cc.szulc.shop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
     private final ProductRepository productRepository;

     public Page<Product> getProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    public Product getProductsBySlug(String slug) {
         return productRepository.findBySlug(slug).orElseThrow();
    }
}
