package patterns.decorator_pattern.first_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class RightBracketDecorator extends Decorator {

    public RightBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(")");
    }
}
