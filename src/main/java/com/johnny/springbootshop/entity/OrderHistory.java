package com.johnny.springbootshop.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order_history")
@Data
public class OrderHistory {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "shipping")
    private String shipping;

    @Column(name = "payment")
    private String payment;

    @Column(name = "total")
    private Float total;

    @Column(name = "user_id")
    private String userId;
}
