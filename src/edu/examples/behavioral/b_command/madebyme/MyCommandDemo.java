package edu.examples.behavioral.b_command.madebyme;

import edu.examples.behavioral.b_command.madebyme.app.Application;
import edu.examples.behavioral.b_command.madebyme.commands.*;
import edu.examples.behavioral.b_command.madebyme.database.Database;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyCommandDemo {

    public static void main(String[] args) {
        Database database = new Database();

        Queue<Command> commandQueue = new ArrayDeque<>();
        commandQueue.add(new InsertCommand(database));
        commandQueue.add(new SelectCommand(database));
        commandQueue.add(new UpdateCommand(database));
        commandQueue.add(new DeleteCommand(database));

        Application app = new Application(commandQueue);
        app.processCommand();
    }


}
