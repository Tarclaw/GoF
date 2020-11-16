package edu.examples.behavioral.b_command.madebyme.commands;

import edu.examples.behavioral.b_command.madebyme.database.Database;

public class SelectCommand implements Command {

    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }

}
