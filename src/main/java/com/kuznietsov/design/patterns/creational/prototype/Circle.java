package com.kuznietsov.design.patterns.creational.prototype;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void print() {
        System.out.println("Inside Circle::print() method.");
    }
}
