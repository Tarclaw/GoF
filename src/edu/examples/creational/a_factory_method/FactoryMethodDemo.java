package edu.examples.creational.a_factory_method;

import edu.examples.creational.a_factory_method.factory.Dialog;
import edu.examples.creational.a_factory_method.factory.HtmlDialog;
import edu.examples.creational.a_factory_method.factory.LinuxDialog;

/** More examples of Factory Method:
  * java.util.Calendar#getInstance()
  * java.util.ResourceBundle#getBundle()
  * java.text.NumberFormat#getInstance()
  * java.nio.charset.Charset#forName()
  * java.net.URLStreamHandlerFactory#createURLStreamHandler(String)
  * java.util.EnumSet#of()
  * javax.xml.bind.JAXBContext#createMarshaller()
 */
public class FactoryMethodDemo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Linux")) {
            dialog = new LinuxDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
