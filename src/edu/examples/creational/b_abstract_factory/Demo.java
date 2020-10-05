package edu.examples.creational.b_abstract_factory;

import edu.examples.creational.b_abstract_factory.app.Application;
import edu.examples.creational.b_abstract_factory.factories.GUIFactory;
import edu.examples.creational.b_abstract_factory.factories.LinuxFactory;
import edu.examples.creational.b_abstract_factory.factories.MacOSFactory;

public class Demo {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        GUIFactory factory = System.getProperty("os.name")
                .toLowerCase()
                .contains("mac") ?  new MacOSFactory() : new LinuxFactory();
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
