package patterns.structural.delegate_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Circle implements Graphics {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
