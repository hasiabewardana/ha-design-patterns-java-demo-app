package org.example.designpatterns.creationalpatterns.abstractfactory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
