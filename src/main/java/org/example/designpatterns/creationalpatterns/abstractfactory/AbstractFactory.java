package org.example.designpatterns.creationalpatterns.abstractfactory;

public interface AbstractFactory {
    Color getColor(String color);
    Shape getShape(String shape);
}
