package edu.examples.creational.e_singleton.holder;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    /**
     * prevent multi thread issue
     */
    static class Holder {
        static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {
        /**
         * prevent reflection issue
         */
        if (Holder.INSTANCE != null) {
            throw new RuntimeException("Already created. Please use getInstance()");
        }
        System.out.println("Create new Singleton");
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * prevent serializable issue
     */
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    /**
     * prevent cloneable issue
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
