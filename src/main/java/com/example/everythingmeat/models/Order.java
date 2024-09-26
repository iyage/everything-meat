package com.example.everythingmeat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import com.example.everythingmeat.utils.BaseClass;
import com.example.everythingmeat.utils.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order extends BaseClass {
    @NotBlank(message = "The order amount is required")
    private Long amount;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
