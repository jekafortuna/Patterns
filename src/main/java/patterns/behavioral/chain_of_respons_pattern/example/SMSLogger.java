package patterns.behavioral.chain_of_respons_pattern.example;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class SMSLogger extends Logger {

    public SMSLogger(int priority) {
        super(priority);
    }

    public void write(String message){
        System.out.println("SMS: " + message);
    }
}
