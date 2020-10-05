package edu.examples.creational.b_abstract_factory.buttons;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created LinuxButton.");
    }
}
