package patterns.behavioral.command_pattern;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class StartCommand implements Command {

    Comp computer;

    public StartCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
