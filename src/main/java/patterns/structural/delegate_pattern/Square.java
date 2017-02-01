package patterns.structural.delegate_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Square implements Graphics {

    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
