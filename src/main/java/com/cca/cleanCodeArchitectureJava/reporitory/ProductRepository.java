package com.cca.cleanCodeArchitectureJava.reporitory;

import com.cca.cleanCodeArchitectureJava.vo.ProductRequestVo;
import com.cca.cleanCodeArchitectureJava.vo.ProductResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final MongoOperations mongoOperations;

    @Autowired
    public ProductRepository (MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public void insertProducts (final List<ProductRequestVo> products) {
        mongoOperations.insert(products);
    }

    public List<ProductResponseVo> getProducts (final List<String> productIds) {

        List<ProductResponseVo> productResponseVos = new ArrayList<>();

        for(String productId : productIds) {
            ProductResponseVo productResponseVo = mongoOperations.findById(productId, ProductResponseVo.class);
            productResponseVos.add(productResponseVo);
        }

        return productResponseVos;
    }
}
