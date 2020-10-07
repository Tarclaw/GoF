package edu.examples.creational.e_singleton.bad_singleton;

import java.io.Serializable;

/**
 * We implement Serializable and Cloneable here only
 * to show the ways how to violate Singleton
 */
public class Singleton implements Serializable, Cloneable {

    private static Singleton soleInstance = null;

    private Singleton() {
        System.out.println("Create new Singleton");
    }

    public static Singleton getInstance() {
        if (soleInstance == null) {
            soleInstance = new Singleton();
        }
        return soleInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}