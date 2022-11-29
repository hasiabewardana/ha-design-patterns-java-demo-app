package org.example;

import org.example.solid.singleresponsibility.compliance.SingleResponsibilityDemo;

import java.io.IOException;

public class HaDesignPatternsJavaDemoAppMain {
    public static void main(String[] args) {
        System.out.println("Welcome to HaDesignPatternsJavaDemoApp!\n");

        // Demonstration without Single Responsibility Principle
        /*try {
            NoSingleResponsibilityDemo.contactController();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // Demonstration of Single Responsibility Principle
        try {
            SingleResponsibilityDemo.contactController();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}