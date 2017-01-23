package patterns.behavioral.strategy_pattern.second_variant;

/**
 * Created on 1. December. 16.
 *
 * @author Evgeniy
 */
public class Dog extends Animal {

    public void digHole(){
        System.out.println("Dug a hole!");
    }

    public Dog() {
        super();
        setSound("Bark");
    }

    public void fly(){
        System.out.println("I can't fly!");
    }
}
