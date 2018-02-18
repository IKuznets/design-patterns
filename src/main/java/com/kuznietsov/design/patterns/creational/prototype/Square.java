package com.kuznietsov.design.patterns.creational.prototype;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void print() {
        System.out.println("Inside Square::print() method.");
    }
}
