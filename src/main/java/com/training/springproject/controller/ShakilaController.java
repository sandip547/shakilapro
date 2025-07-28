package com.training.springproject.controller;


import com.training.springproject.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/ser")
public class ShakilaController {

    @GetMapping("/get-name")
    public Product getName(){
        return new Product(1,"Mobile");
    }


}
