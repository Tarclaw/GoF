package edu.examples.behavioral.d_mediator;

import edu.examples.behavioral.d_mediator.components.*;
import edu.examples.behavioral.d_mediator.mediators.Editor;
import edu.examples.behavioral.d_mediator.mediators.Mediator;

import javax.swing.*;

/**
 * Here are some examples of the pattern in core Java libraries:
 *     java.util.Timer (all scheduleXXX() methods)
 *     java.util.concurrent.Executor#execute()
 *     java.util.concurrent.ExecutorService (invokeXXX() and submit() methods)
 *     java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)
 *     java.lang.reflect.Method#invoke()
 */
public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
