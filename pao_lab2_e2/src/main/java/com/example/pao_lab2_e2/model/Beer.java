package com.example.pao_lab2_e2.model;

import java.math.BigDecimal;

public class Beer extends Product {
    private BigDecimal percentage;

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public Beer(int id, String name, BigDecimal percentage) {
        super(id, name);
        this.percentage = percentage;
    }
}
