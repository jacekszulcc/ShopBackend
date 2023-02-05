package cc.szulc.shop.review.repository;

import cc.szulc.shop.common.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
