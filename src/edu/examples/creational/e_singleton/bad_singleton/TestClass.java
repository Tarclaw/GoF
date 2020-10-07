package edu.examples.creational.e_singleton.bad_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {

    public static void main(String[] args) {
        multithreadFuckUp(); //works only if use first
        howWeExpectItWork();
        serializationDeserealizationFuckUp();
        cloneFuckUp();
        reflectionFuckUp();
    }

    private static void howWeExpectItWork() {
        //Singleton singleton = new Singleton(); we can't do this

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        print("s1", s1.hashCode());
        print("s2", s2.hashCode());
    }

    private static void reflectionFuckUp() {
        try {
            Class clazz = Class.forName("edu.examples.creational.e_singleton.bad_singleton.Singleton");
            Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton s3 = constructor.newInstance();
            print("s3", s3.hashCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void serializationDeserealizationFuckUp() {
        try {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("src/edu/examples/creational/e_singleton/file.txt")
            );
            objectOutputStream.writeObject(Singleton.getInstance());

            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("src/edu/examples/creational/e_singleton/file.txt")
            );
            Singleton s4 = (Singleton) objectInputStream.readObject();
            print("s4", s4.hashCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void cloneFuckUp() {
        try {
            Singleton s5 = (Singleton) Singleton.getInstance().clone();
            print("s5", s5.hashCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * to make it work call this method several times
     * till 2 thread create 2 singletons
     */
    private static void multithreadFuckUp() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(TestClass::useSingleton);
        service.submit(TestClass::useSingleton);
        service.shutdown();
    }

    private static void useSingleton() {
        print("singleton", Singleton.getInstance().hashCode());
    }

    private static void print(String name, int hash) {
        System.out.println(String.format("Singleton: %s, Hashcode: %d", name, hash));
    }
}
