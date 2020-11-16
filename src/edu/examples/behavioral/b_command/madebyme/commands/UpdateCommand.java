package edu.examples.behavioral.b_command.madebyme.commands;

import edu.examples.behavioral.b_command.madebyme.database.Database;

public class UpdateCommand implements Command {

    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }

}
