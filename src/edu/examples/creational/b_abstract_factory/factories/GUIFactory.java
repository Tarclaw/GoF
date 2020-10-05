package edu.examples.creational.b_abstract_factory.factories;

import edu.examples.creational.b_abstract_factory.buttons.Button;
import edu.examples.creational.b_abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
