package patterns.creational.prototype_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class HumanFactory {

    private Human human;

    public HumanFactory(Human human){
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    Human makeCopy(){
        return (Human) human.copy();
    }
}
