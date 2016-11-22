package patterns.flyweight_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Square implements Shape{

    private int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + ", " + y + ") : let's draw a square with a side " + a);
    }
}
