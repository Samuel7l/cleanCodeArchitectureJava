package com.cca.cleanCodeArchitectureJava.vo;

import java.math.BigDecimal;

public class ProductRequestVo {

    private String description;
    private BigDecimal price;
    private Integer quantity;

    public ProductRequestVo() {
        super();
    }

    public ProductRequestVo(String description, BigDecimal price, Integer quantity) {
        this.description = description;
        this.price = price;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
