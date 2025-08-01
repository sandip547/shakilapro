package com.training.springproject.service;

import com.training.springproject.ProductName;
import com.training.springproject.model.Product;
import com.training.springproject.model.ProductResponse;
import com.training.springproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShakilaService {
    List<Product> li;

    @Autowired
    ProductRepository productRepository;
    public ShakilaService(){
        this.li  = new ArrayList<>();
    }
    public Product getName(){
        return new Product(1,"Mobile");
    }

    public Product saveProduct(Product product){
        productRepository.save(product);
        return product;
    }

    public List<Product> getProductList(){
        return this.li;
    }



    public Product getProduct(String product) {
//        List<Product> list = getProductList();
//        for (Product p: list) {
//            if (product.equals(p.getProductName())){
//                return p;
//            }
//        }
//        return new Product(1,"testProductFailed");
//    }

        return productRepository.findProductByProductName(product);
    }

    //TODO: controller accepts list of person save it to database
    //TODO:  controller search according to personId
    //TODO: controller to getListOfPerson

    //Product Class{
    //
    //id, name
    //
    ////getters
    ////setters
    //
    //NameClass getName(){
    //
    //}
    //}
    //
    //NameClass {
    //
    //String formatName(){
    //
    //}
    //
    //}
    //
    //list - product1,product2,product3....
    //
    //E-  Product/Person/List<Person>
    //
    //new Product(1,"Laptop").
    //
    //NameClass
    //  formatName()
    //
    //String getProductName(){
    //
    //list.get(0).getName().formatName();
    //
    //Product p = list.get(0);
    //NameClass nc = p.getName();
    //String finalVal = nc.formatName()
    //
    //
    //
    //}


}
