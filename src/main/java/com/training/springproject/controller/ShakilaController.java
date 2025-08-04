package com.training.springproject.controller;


import com.training.springproject.ProductName;
import com.training.springproject.model.Product;
import com.training.springproject.model.ProductDTO;
import com.training.springproject.model.ProductResponse;
import com.training.springproject.service.ShakilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/ser")
public class ShakilaController {

    @Autowired
    ShakilaService shakilaService;

    @GetMapping("/get-name")
    public Product getName(){
        return shakilaService.getName();
    }

    @GetMapping("/product/{name}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable String name){
        ProductDTO pro = shakilaService.getProduct(name);
//        if(pro.getProductName().equals("testProductFailed")){
//            return new ResponseEntity<>(new ProductResponse(HttpStatus.NOT_FOUND,pro),HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(new ProductResponse(HttpStatus.OK,pro),HttpStatus.OK);

        return new ResponseEntity<>(pro,HttpStatus.OK);
    }

    @PostMapping("/product/addProduct")
    public ProductDTO addProduct(@RequestBody ProductDTO product){
        return shakilaService.saveProduct(product);
    }


}
