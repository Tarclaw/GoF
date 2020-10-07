package edu.examples.creational.e_singleton.correct_but_messy;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    /**
     * java compiler allows to publish in runtime half initialize variables
     * and threads see this.
     * volatile variable will be publish only when the change is complete.
     * we made this change in order to solve multithred issue
     */
    private static volatile Singleton soleInstance = null;

    private Singleton() {
        if (soleInstance != null) {
            /**
             * we solve reflection issue here but what to do if use reflection when singleton is null?
             */
            throw new RuntimeException("Already created. Please use getInstance()");
        }
        System.out.println("Create new Singleton");
    }

    public static Singleton getInstance() {
        /**
         * we resolve multithreting issue here, pay attention that here we check soleInstance == null twice
         * that's because one thread can execute code on line 28 when another wait on line 26
         */
        if (soleInstance == null) {
            synchronized (Singleton.class) {
                if (soleInstance == null) {
                    soleInstance = new Singleton();
                }
            }
        }
        return soleInstance;
    }

    /**
     * if for some reason our singleton must be serializable
     * then implementation of this method do the trick
     */
    private Object readResolve() throws ObjectStreamException {
        System.out.println("--- read resolve ---");
        return soleInstance;
    }

    /**
     * I dont see when we might want to clone singleton
     * but anyway the only thing we can do is to return
     * same instance or throw an exception, if now - we
     * will have another implementation
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return soleInstance;
    }
}
