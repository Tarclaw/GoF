package edu.examples.creational.b_abstract_factory.factories;

import edu.examples.creational.b_abstract_factory.buttons.Button;
import edu.examples.creational.b_abstract_factory.buttons.LinuxButton;
import edu.examples.creational.b_abstract_factory.checkboxes.Checkbox;
import edu.examples.creational.b_abstract_factory.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
