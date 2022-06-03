package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    private Long orderId;
    private int quantity;
    private double amount;
    private String orderDate;

    @ManyToOne
    @JoinColumn(referencedColumnName = "customerId",name = "id")
    private Customer customer;
}
