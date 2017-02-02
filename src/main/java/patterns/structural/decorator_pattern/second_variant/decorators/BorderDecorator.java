package patterns.structural.decorator_pattern.second_variant.decorators;

import patterns.structural.decorator_pattern.second_variant.objects.Component;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println(".... added border");
    }
}
