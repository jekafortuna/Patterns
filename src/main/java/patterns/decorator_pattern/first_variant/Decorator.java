package patterns.decorator_pattern.first_variant;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public abstract class Decorator implements PrinterInterface {

    PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }

    public void print(){
        component.print();
    }
}
