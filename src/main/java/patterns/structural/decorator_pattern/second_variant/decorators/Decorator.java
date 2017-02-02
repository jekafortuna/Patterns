package patterns.structural.decorator_pattern.second_variant.decorators;

import patterns.structural.decorator_pattern.second_variant.objects.Component;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
