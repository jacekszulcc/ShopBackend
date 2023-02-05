package cc.szulc.shop.common.repository;

import cc.szulc.shop.common.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findAllByProductIdAndModerated(Long productId, boolean moderated);

}
