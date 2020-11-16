package edu.examples.behavioral.b_command.madebyme.commands;

import edu.examples.behavioral.b_command.madebyme.database.Database;

public class DeleteCommand implements Command {

    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }


}
