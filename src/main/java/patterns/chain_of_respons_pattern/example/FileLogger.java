package patterns.chain_of_respons_pattern.example;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class FileLogger extends Logger {

    public FileLogger(int priority) {
        super(priority);
    }

    public void write(String message){
        System.out.println("Logging into file: " + message);
    }
}
