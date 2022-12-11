package cc.szulc.shop.product.service;

import cc.szulc.shop.product.model.Product;
import cc.szulc.shop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

     public List<Product> getProducts(){
        return productRepository.findAll();
    }

}
