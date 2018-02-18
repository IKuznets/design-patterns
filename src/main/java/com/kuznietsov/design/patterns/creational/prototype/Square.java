package com.kuznietsov.design.patterns.creational.prototype;

class Square extends Shape {

    Square() {
        type = "Square";
    }

    @Override
    void print() {
        System.out.println("Inside Square::print() method.");
    }
}
