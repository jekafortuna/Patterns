package patterns.iterator_pattern;

/**
 * Created on 21. November. 16.
 * Iterator pattern realization example
 *
 * @author Evgeniy
 */
public class IteratorApp {
    public static void main(String[] args) {

        Tasks concreteAggregate = new Tasks();

        Iterator iterator = concreteAggregate.getIterator();

        while (iterator.hasNext()){
            System.out.println((String)iterator.next());
        }
    }
}
