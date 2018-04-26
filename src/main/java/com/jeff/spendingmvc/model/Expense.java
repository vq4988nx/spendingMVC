package com.jeff.spendingmvc.model;

import javax.persistence.*;

@Entity
public class Expense {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String dayt;

    private String amount;

    private String description;

    private String category;

    public Task(String dayt, String amount, String description, String category) {
        this.dayt = dayt;
        this.amount = amount;
        this.description = description;
        this.category = category;
    }

}
