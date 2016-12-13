package patterns.state_pattern.stateTask;

/**
 * Created on 13. December. 16.
 *
 * @author Evgeniy
 */
public class Mushroomer implements HumanState {

    @Override
    public void changeRole(Human context) {
        System.out.println("Now I'm a Mushroomer!");
    }
}
