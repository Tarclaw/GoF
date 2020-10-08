package edu.examples.structural.d_decorator.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}
