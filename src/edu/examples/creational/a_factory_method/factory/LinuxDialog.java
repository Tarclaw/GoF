package edu.examples.creational.a_factory_method.factory;

import edu.examples.creational.a_factory_method.buttons.Button;
import edu.examples.creational.a_factory_method.buttons.LinuxButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class LinuxDialog extends Dialog {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
