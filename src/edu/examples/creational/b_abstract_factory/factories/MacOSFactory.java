package edu.examples.creational.b_abstract_factory.factories;

import edu.examples.creational.b_abstract_factory.buttons.Button;
import edu.examples.creational.b_abstract_factory.buttons.MacOSButton;
import edu.examples.creational.b_abstract_factory.checkboxes.Checkbox;
import edu.examples.creational.b_abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
