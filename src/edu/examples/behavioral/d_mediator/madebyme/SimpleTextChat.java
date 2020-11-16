package edu.examples.behavioral.d_mediator.madebyme;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {

    private Admin admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {

        for (User u: users) {
            if(u != user) {
                u.receiveMessage(message);
            }
        }

        admin.receiveMessage(message);

    }
}
