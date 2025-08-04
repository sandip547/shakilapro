package com.training.springproject.model;

public class Person {
    private int id;
    private String name;

    public static void main(String[] args) {
        Person p = new Person();
        p.id = 90;
        System.out.println(p.id);
        p.id = 91;
        System.out.println(p.id);
    }
}
