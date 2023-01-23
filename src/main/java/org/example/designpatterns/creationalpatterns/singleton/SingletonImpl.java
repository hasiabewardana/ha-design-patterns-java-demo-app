package org.example.designpatterns.creationalpatterns.singleton;

public class SingletonImpl {
    private static SingletonImpl instance = null;

    private SingletonImpl() {
        // private constructor to prevent instantiation
    }

    public static SingletonImpl getInstance() {
        if (instance == null) {
            instance = new SingletonImpl();
        }
        return instance;
    }
}
