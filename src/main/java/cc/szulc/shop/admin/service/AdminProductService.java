package cc.szulc.shop.admin.service;

import cc.szulc.shop.admin.repository.AdminProductRepository;
import cc.szulc.shop.admin.model.AdminProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminProductService {

    private final AdminProductRepository productRepository;

    public Page<AdminProduct> getProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }
}
