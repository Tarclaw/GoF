package edu.examples.behavioral.d_mediator.madebyme;

public class AppRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        Admin admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Yo fuckers!");
        admin.sendMessage("STFU! Or I kick u.");

    }
}
