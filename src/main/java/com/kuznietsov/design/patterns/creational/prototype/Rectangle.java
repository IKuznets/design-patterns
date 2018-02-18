package com.kuznietsov.design.patterns.creational.prototype;

class Rectangle extends Shape {

    Rectangle() {
        type = "Rectangle";
    }

    @Override
    void print() {
        System.out.println("Inside Rectangle::print() method.");
    }
}
