package org.example.designpatterns.creationalpatterns.abstractfactory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        } else if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
