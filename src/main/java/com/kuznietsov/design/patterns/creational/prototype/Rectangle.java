package com.kuznietsov.design.patterns.creational.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void print() {
        System.out.println("Inside Rectangle::print() method.");
    }
}
