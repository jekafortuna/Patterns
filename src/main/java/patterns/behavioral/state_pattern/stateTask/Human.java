package patterns.behavioral.state_pattern.stateTask;

/**
 * Created on 13. December. 16.
 *
 * @author Evgeniy
 */
public class Human {

    private HumanState state;
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void changeStateByLocation(){

        if (this.getLocation() == Location.BEACH_OF_RIVER) {
            System.out.println("We are at the beach of river! ");
            this.state = new Fisher();
        }
        else if (this.getLocation() == Location.LAND_OF_MUSHROOMS) {
            System.out.println("We are at the land of mushrooms! ");
            this.state = new Mushroomer();
        }
        else if (this.getLocation() == Location.MEET_AN_ANIMAL) {
            System.out.println("We meet an animal! Be careful! ");
            this.state = new Hunter();
        }
    }

    public void changeRole(){
        state.changeRole(this);
    }
}
