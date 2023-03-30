package cc.szulc.shop.cart.service;

import cc.szulc.shop.common.model.Cart;
import cc.szulc.shop.common.repository.CartItemRepository;
import cc.szulc.shop.common.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CartCleanupService {

    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;

    @Transactional
    @Scheduled(cron = "${app.cart.cleanup.expression}")
    public void cleanupOldCarts(){
        List<Cart> carts = cartRepository.findByCreatedLessThan(LocalDateTime.now().minusDays(3));
        List<Long> ids = carts.stream()
                .map(Cart::getId)
                .toList();
        if(!ids.isEmpty()){
            cartItemRepository.deleteAllByCartIdIn(ids);
            cartRepository.deleteAllById(ids);
        }
    }
}
