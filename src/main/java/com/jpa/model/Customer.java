package com.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private Long customerId;
    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "customer")
    private List<Orders> order;
}
