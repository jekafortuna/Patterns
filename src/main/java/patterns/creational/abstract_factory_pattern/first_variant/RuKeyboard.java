package patterns.creational.abstract_factory_pattern.first_variant;

/**
 * Created on 18. November. 16.
 *
 * @author Evgeniy
 */
public class RuKeyboard implements Keyboard {

    @Override
    public void print() {
        System.out.print("Печатаем строку. ");
    }

    @Override
    public void println() {
        System.out.println("Печатаем строку с переводом строки. ");
    }
}
