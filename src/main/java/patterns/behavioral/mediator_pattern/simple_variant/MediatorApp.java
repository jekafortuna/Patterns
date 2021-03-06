package patterns.behavioral.mediator_pattern.simple_variant;

/**
 * Created on 21. November. 16.
 * Mediator pattern realization example
 *
 * @author Evgeniy
 */
public class MediatorApp {
    public static void main(String[] args) {

        TextChat textChat = new TextChat();

        User admin = new Admin(textChat);
        User u1 = new SimpleUser(textChat);
        User u2 = new SimpleUser(textChat);

        textChat.setAdmin(admin);
        textChat.addUser(u1);
        textChat.addUser(u2);

        u1.sendMessage("Hello! I'm a simple user!");
        admin.sendMessage("ADMIN is logged into the chat!");
    }
}
