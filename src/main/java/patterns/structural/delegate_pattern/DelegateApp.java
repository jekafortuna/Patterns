package patterns.structural.delegate_pattern;

/**
 * Created on 21. November. 16.
 * Delegate pattern realization example
 *
 * @author Evgeniy
 */
public class DelegateApp {
    public static void main(String[] args) {
//        A a = new A();
//        a.f();

        Painter painter = new Painter();
        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Triangle());
        painter.draw();
    }
}
