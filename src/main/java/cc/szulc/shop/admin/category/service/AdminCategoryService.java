package cc.szulc.shop.admin.category.service;

import cc.szulc.shop.admin.category.controller.dto.AdminCategoryDto;
import cc.szulc.shop.admin.category.model.AdminCategory;
import cc.szulc.shop.admin.category.repository.AdminCategoryRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminCategoryService {

    private final AdminCategoryRepository adminCategoryRepository;
    public List<AdminCategory> getCategories() {
        return adminCategoryRepository.findAll();
    }

    public AdminCategory getCategory(Long id) {
        return adminCategoryRepository.findById(id).orElseThrow();
    }

    public AdminCategory createCategory(AdminCategory adminCategory) {
        return adminCategoryRepository.save(adminCategory);
    }

    public AdminCategory updateCategory(AdminCategory adminCategory) {
        return adminCategoryRepository.save(adminCategory);
    }


    public void deleteCategory(Long id) {
        adminCategoryRepository.deleteById(id);
    }
}
