package cc.szulc.shop.admin.order.controller;

import cc.szulc.shop.admin.order.controller.dto.AdminOrderDto;
import cc.szulc.shop.admin.order.controller.mapper.AdminOrderMapper;
import cc.szulc.shop.admin.order.model.AdminOrder;
import cc.szulc.shop.admin.order.service.AdminOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("/admin/orders")
@RequiredArgsConstructor
public class AdminOrderController {

    private final AdminOrderService adminOrderService;

    @GetMapping
    public Page<AdminOrderDto> getOrders(Pageable pageable) {
        return AdminOrderMapper.mapToPageDtos(adminOrderService.getOrders(pageable));
    }

    @GetMapping("/{id}")
    public AdminOrder getOrders(@PathVariable Long id) {
        return adminOrderService.getOrder(id);
    }
}
