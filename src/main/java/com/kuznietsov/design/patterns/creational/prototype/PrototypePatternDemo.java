package com.kuznietsov.design.patterns.creational.prototype;

import java.util.Map;

public class PrototypePatternDemo {

    public static void main(String[] args) {
        Shape clonedShape = getShape("Circle");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = getShape("Rectangle");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = getShape("Square");
        System.out.println("Shape : " + clonedShape3.getType());
    }

    private static Map<String, Shape> shapeMap  = Map.of(
            "Circle", new Circle(),
            "Rectangle", new Rectangle(),
            "Square", new Square()
    );

    private static Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        return shape.clone();
    }
}
