package com.cca.cleanCodeArchitectureJava.entity;

import java.math.BigDecimal;

public class Product {

    private String description;
    private BigDecimal price;
    private String cpf;
    private Integer quantity;

    public Product(String description, BigDecimal price, String cpf, Integer quantity) {
        this.description = description;
        this.price = price;
        this.cpf = cpf;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
