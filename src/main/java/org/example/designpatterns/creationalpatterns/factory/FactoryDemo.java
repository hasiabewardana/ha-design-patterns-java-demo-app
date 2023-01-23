package org.example.designpatterns.creationalpatterns.factory;

public class FactoryDemo {
    public static void demoFactoryPattern(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
    }
}
