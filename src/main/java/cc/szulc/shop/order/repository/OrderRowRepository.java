package cc.szulc.shop.order.repository;

import cc.szulc.shop.order.model.OrderRow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRowRepository extends JpaRepository<OrderRow, Long> {
}
