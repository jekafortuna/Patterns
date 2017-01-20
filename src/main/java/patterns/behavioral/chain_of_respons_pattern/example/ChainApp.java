package patterns.behavioral.chain_of_respons_pattern.example;

/**
 * Created on 21. November. 16.
 * Chain of responsibility pattern realization example
 *
 * @author Evgeniy
 */
public class ChainApp {
    public static void main(String[] args) {

        Logger logger0 = new SMSLogger(Level.ERROR);
        Logger logger1 = new FileLogger(Level.DEBUG);
        Logger logger2 = new EmailLogger(Level.INFO);

        logger0.setNext(logger1);
        logger1.setNext(logger2);

        logger0.writeMessage("Everything is OK", Level.INFO);
        logger0.writeMessage("Debugging mode", Level.DEBUG);
        logger0.writeMessage("System crashed", Level.ERROR);
    }
}
