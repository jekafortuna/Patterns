package patterns.decorator_pattern.second_variant.decorators;

import patterns.decorator_pattern.second_variant.objects.Component;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("..... added color");
    }
}
