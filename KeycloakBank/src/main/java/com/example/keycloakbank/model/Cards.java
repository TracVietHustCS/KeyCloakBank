package com.example.keycloakbank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter @Setter
@Table(name = "cards")
public class Cards extends BaseEntity{

    @Id
    @Column(name = "card_id")
    private long cardId;



    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "total_limit")
    private int totalLimit;

    @Column(name = "amount_used")
    private int amountUsed;

    @Column(name = "available_amount")
    private int availableAmount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
