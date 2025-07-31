package com.training.springproject.service;

import com.training.springproject.ProductName;
import com.training.springproject.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShakilaService {
    List<Product> li;
    public ShakilaService(){
        this.li  = new ArrayList<>();
    }
    public Product getName(){
        return new Product(1,"Mobile");
    }

    public Product saveProduct(Product product){
        li.add(product);
        return product;
    }

    public List<Product> getProductList(){
        return this.li;
    }



    public Product getProduct(String product){
        List<Product> list = getProductList();
        for (Product p: list) {
            if (product.equals(p.getProductName())){
                return p;
            }
        }
        return new Product(1,"testProductFailed");
    }
}
