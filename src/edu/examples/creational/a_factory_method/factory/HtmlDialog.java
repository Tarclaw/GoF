package edu.examples.creational.a_factory_method.factory;

import edu.examples.creational.a_factory_method.buttons.Button;
import edu.examples.creational.a_factory_method.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
