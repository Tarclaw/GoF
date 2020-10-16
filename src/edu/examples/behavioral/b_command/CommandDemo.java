package edu.examples.behavioral.b_command;

import edu.examples.behavioral.b_command.editor.Editor;

/**
 * Examples from real world:
 *  - all implementations of java.lang.Runnable
 *  - all implementations of javax.swing.Action
 */
public class CommandDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
