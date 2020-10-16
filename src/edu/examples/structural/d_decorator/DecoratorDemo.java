package edu.examples.structural.d_decorator;

import edu.examples.structural.d_decorator.decorators.*;

/**
 * Here are some examples of Decorator in core Java libraries: *
 *     All subclasses of java.io.InputStream, OutputStream, Reader and Writer have constructors that accept objects of their own type. *
 *     java.util.Collections, methods checkedXXX(), synchronizedXXX() and unmodifiableXXX(). *
 *     javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper *
 * Identification: Decorator can be recognized by creation methods or constructor that accept objects of the same class or interface as a current class.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                              new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt"))
                                       );
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
