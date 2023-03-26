package cc.szulc.shop.order.model.dto;

import cc.szulc.shop.order.model.Payment;
import cc.szulc.shop.order.model.Shipment;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class InitOrder {
    private List<Shipment> shipment;
    private List<Payment> payment;
}
