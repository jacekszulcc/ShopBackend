package cc.szulc.shop.order.model.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class OrderDto {
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
    private String street;
    @NotBlank
    private String zipcode;
    @NotBlank
    private String city;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String phone;
    @NotBlank
    private Long cartId;
    @NotBlank
    private Long shipmentId;
    @NotBlank
    private Long paymentId;
}
