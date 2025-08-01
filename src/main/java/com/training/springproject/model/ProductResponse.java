package com.training.springproject.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

public class ProductResponse {
    private Product p;
    private HttpStatus httpStatus;
    private Date date;
    String s;
    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public ProductResponse(HttpStatus httpStatus,Product p) {
        this.httpStatus = httpStatus;
        this.date = new Date();
        this.p = p;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
