package edu.examples.behavioral.b_command.madebyme.app;

import edu.examples.behavioral.b_command.madebyme.commands.Command;

import java.util.Queue;

public class Application {

    private Queue<Command> commandQueue;

    public Application(Queue<Command> commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void processCommand() {
        commandQueue.forEach(Command::execute);
    }

    public Queue<Command> getCommands() {
        return commandQueue;
    }
}
