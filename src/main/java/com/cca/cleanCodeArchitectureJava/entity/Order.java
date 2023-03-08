package com.cca.cleanCodeArchitectureJava.entity;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private List<Product> products;
    private List<Deal> deals;
    private BigDecimal finalPrice;

    public Order(List<Product> products, List<Deal> deals, BigDecimal finalPrice) {
        this.products = products;
        this.deals = deals;
        this.finalPrice = finalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }
}
