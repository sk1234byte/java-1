package com.employee2;

public class Employee {
    private String name;
    private int age;
    private String city;

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void display(){
        System.out.println("The name is " + this.name);
        System.out.println("The age is " + this.age);
        System.out.println("The city is " + this.city);
    }
}