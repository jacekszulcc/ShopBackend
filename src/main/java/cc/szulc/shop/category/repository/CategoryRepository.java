package cc.szulc.shop.category.repository;

import cc.szulc.shop.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findBySlug(String slug);
}
