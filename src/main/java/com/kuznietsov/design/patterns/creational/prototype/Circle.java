package com.kuznietsov.design.patterns.creational.prototype;

class Circle extends Shape {

    Circle() {
        type = "Circle";
    }

    @Override
    void print() {
        System.out.println("Inside Circle::print() method.");
    }
}
