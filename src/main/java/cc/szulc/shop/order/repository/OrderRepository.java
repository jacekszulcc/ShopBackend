package cc.szulc.shop.order.repository;

import cc.szulc.shop.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
