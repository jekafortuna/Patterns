package patterns.behavioral.mediator_pattern.simple_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Admin implements User {

    private Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin gets a message '" + message + "'");
    }
}
