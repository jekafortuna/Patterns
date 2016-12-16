package patterns.delegate_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public class B {

    A a = new A();

    void f(){
        a.f();
    }
}
