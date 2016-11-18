package patterns.command_pattern;

/**
 * Created on 17. November. 16.
 *
 * @author Evgeniy
 */
public class ResetCommand implements Command{

    Comp computer;

    public ResetCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
