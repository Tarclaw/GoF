package edu.examples.behavioral.d_mediator.madebyme;

public class SimpleUser implements User {

    private Chat chat;
    private String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " receiving message: " + message);
    }
}
