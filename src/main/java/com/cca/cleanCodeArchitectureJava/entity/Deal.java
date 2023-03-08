package com.cca.cleanCodeArchitectureJava.entity;

import java.math.BigDecimal;

public class Deal {

    private String description;
    private BigDecimal value;

    public Deal(String description, BigDecimal value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
