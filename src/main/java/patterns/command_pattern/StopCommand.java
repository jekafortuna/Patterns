package patterns.command_pattern;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class StopCommand implements Command {

    Comp computer;

    public StopCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
