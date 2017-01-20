package patterns.behavioral.chain_of_respons_pattern.example;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public abstract class Logger {

    public int priority;

    public Logger(int priority) {
        this.priority = priority;
    }

    public Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority){
            write(message);
        }
        if (next != null){
            next.writeMessage(message, level);
        }
    }

    abstract void write(String message);
}
