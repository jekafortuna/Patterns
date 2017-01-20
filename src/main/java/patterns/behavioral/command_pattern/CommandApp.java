package patterns.behavioral.command_pattern;

/**
 * Created on 17. November. 16.
 * Command pattern realization example
 *
 * @author Evgeniy
 */
public class CommandApp {
    public static void main(String[] args) {

        Comp comp = new Comp();
        User user = new User(new StartCommand(comp), new StopCommand(comp),
                new ResetCommand(comp));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}
