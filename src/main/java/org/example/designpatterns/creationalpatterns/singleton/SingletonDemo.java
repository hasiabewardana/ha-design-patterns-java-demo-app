package org.example.designpatterns.creationalpatterns.singleton;

public class SingletonDemo {
    public static void demoSingletonPattern(){
        SingletonImpl s1 = SingletonImpl.getInstance();
        SingletonImpl s2 = SingletonImpl.getInstance();

        System.out.println("if s1 == s2: " + (s1 == s2));
    }
}
