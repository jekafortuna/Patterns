package patterns.structural.decorator_pattern.first_variant;

/**
 * Created on 21. November. 16.
 * Decorator pattern realization example
 *
 * @author Evgeniy
 */
public class DecoratorApp {
    public static void main(String[] args) {

//        PrinterInterface printerInterface = new Printer("Hello!");
//        PrinterInterface printerInterface = new QuotesDecorator(new Printer("Hello"));

        PrinterInterface printerInterface = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hello"))));
        printerInterface.print();
    }
}
