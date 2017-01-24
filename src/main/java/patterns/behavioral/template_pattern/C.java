package patterns.behavioral.template_pattern;

/**
 * Created on 21. November. 16.
 *
 * @author Evgeniy
 */
public abstract class C {

    void templateMethod(){
        System.out.print("1");
        differ();
        System.out.print("3");
        differ2();
    }

    abstract void differ();
    abstract void differ2();
}
