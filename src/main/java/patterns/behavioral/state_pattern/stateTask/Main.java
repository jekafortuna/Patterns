package patterns.behavioral.state_pattern.stateTask;

/**
 * Created on 13. December. 16.
 * State pattern realization example
 *
 * @author Evgeniy
 */
public class Main {
    public static void main(String[] args) {

        Human human = new Human();

        human.setLocation(Location.BEACH_OF_RIVER);
        human.changeStateByLocation();
        human.changeRole();

        human.setLocation(Location.LAND_OF_MUSHROOMS);
        human.changeStateByLocation();
        human.changeRole();

        human.setLocation(Location.MEET_AN_ANIMAL);
        human.changeStateByLocation();
        human.changeRole();
    }
}
