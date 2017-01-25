package patterns.creational.abstract_factory_pattern.first_variant;

/**
 * Created on 18. November. 16.
 *
 * @author Evgeniy
 */
public interface DeviceFactory {
    public Keyboard getKeyboard();
    public Mouse getMouse();
    public TouchPad getTouchpad();
}
