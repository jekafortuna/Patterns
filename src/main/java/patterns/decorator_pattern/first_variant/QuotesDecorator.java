package patterns.decorator_pattern.first_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class QuotesDecorator extends Decorator {

    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}
