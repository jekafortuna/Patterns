package patterns.structural.decorator_pattern.second_variant.objects;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class Window implements Component {

    @Override
    public void draw() {
        System.out.println("Draw window");
    }
}
