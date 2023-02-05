package cc.szulc.shop.review.service;

import cc.szulc.shop.common.model.Review;
import cc.szulc.shop.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public Review addReview(Review review){
        return reviewRepository.save(review);
    }
}
