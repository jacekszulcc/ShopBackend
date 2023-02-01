package cc.szulc.shop.admin.category.repository;

import cc.szulc.shop.admin.category.model.AdminCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminCategoryRepository extends JpaRepository<AdminCategory, Long> {
}
