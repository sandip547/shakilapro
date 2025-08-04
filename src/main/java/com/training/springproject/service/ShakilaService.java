package com.training.springproject.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.springproject.ProductName;
import com.training.springproject.model.Product;
import com.training.springproject.model.ProductDTO;
import com.training.springproject.model.ProductResponse;
import com.training.springproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ShakilaService {

    private final ProductRepository productRepository;
//
//    ShakilaService(ProductRepository p){
//        this.productRepository = p;
//    }

    List<Product> li;



    public Product getName(){
        return new Product(1,"Mobile");
    }

    public ProductDTO saveProduct(ProductDTO product){
        ObjectMapper objectMapper = new ObjectMapper();
        Product p = objectMapper.convertValue(product,Product.class);
        productRepository.save(p);
        return product;
    }

    public List<Product> getProductList(){
        return this.li;
    }



    public ProductDTO getProduct(String product) {
//        List<Product> list = getProductList();
//        for (Product p: list) {
//            if (product.equals(p.getProductName())){
//                return p;
//            }
//        }
//        return new Product(1,"testProductFailed");
//    }
        ObjectMapper objectMapper = new ObjectMapper();
        ProductDTO productDTO = objectMapper.convertValue(productRepository.findProductByProductName(product),ProductDTO.class);

        return productDTO;
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
