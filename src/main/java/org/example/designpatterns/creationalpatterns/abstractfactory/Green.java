package org.example.designpatterns.creationalpatterns.abstractfactory;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
