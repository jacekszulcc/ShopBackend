package cc.szulc.shop.admin.order.repository;

import cc.szulc.shop.admin.order.model.AdminOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminOrderRepository extends JpaRepository<AdminOrder, Long> {
}
