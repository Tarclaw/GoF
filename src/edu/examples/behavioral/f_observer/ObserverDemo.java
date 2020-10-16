package edu.examples.behavioral.f_observer;

import edu.examples.behavioral.f_observer.editor.Editor;
import edu.examples.behavioral.f_observer.listeners.EmailNotificationListener;
import edu.examples.behavioral.f_observer.listeners.LogOpenListener;

/**
 * Here are some examples of the pattern in core Java libraries:
 *     java.util.Observer/java.util.Observable (rarely used in real world)
 *     All implementations of java.util.EventListener (practically all over Swing components)
 *     javax.servlet.http.HttpSessionBindingListener
 *     javax.servlet.http.HttpSessionAttributeListener
 *     javax.faces.event.PhaseListener *
 * Identification: The pattern can be recognized by subscription methods, that store objects in a list and by calls to
 * the update method issued to objects in that list. *
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
