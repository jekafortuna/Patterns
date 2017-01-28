package patterns.creational.prototype_pattern;

/**
 * Created on 21. November. 16.
 * Prototype pattern realization example
 *
 * @author Evgeniy
 */
public class PrototypeApp {
    public static void main(String[] args) {

        Human original = new Human(20, "Joe");
        System.out.println(original);

        Human copy = (Human) original.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(copy);
        Human h1 = factory.makeCopy();
        System.out.println(h1);

        factory.setPrototype(new Human(30, "Julia"));
        Human h2 = factory.makeCopy();
        System.out.println(h2);
    }
}
