package patterns.abstract_factory_pattern.first_variant;

/**
 * Created on 18. November. 16.
 *
 * @author Evgeniy
 */
public class RuDeviceFactory implements DeviceFactory {

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public TouchPad getTouchpad() {
        return new RuTouchPad();
    }
}
