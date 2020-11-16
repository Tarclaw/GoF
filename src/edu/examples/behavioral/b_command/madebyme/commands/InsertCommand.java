package edu.examples.behavioral.b_command.madebyme.commands;

import edu.examples.behavioral.b_command.madebyme.database.Database;

public class InsertCommand implements Command {

    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
