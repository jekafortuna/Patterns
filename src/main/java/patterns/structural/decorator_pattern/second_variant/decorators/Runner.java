package patterns.structural.decorator_pattern.second_variant.decorators;

import patterns.structural.decorator_pattern.second_variant.objects.Button;
import patterns.structural.decorator_pattern.second_variant.objects.Component;
import patterns.structural.decorator_pattern.second_variant.objects.TextView;
import patterns.structural.decorator_pattern.second_variant.objects.Window;

/**
 * Created on 21. November. 16.
 * Decorator pattern realization example
 *
 * @author Evgeniy
 */
public class Runner {
    private static Component window;
    private static Component textView;
    private static Component button;

    public static void main(String[] args) {
        boolean showBorder = true;

        if (!showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        }
        else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }

        window.draw();
        textView.draw();
        button.draw();
    }
}
