package org.example.designpatterns.creationalpatterns.abstractfactory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
