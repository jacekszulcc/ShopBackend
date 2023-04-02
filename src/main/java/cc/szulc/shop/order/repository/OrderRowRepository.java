package cc.szulc.shop.order.repository;

import cc.szulc.shop.order.model.Order;
import cc.szulc.shop.order.model.OrderRow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRowRepository extends JpaRepository<OrderRow, Long> {
}
