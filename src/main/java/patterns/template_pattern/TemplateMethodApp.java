package patterns.template_pattern;

/**
 * Created on 21. November. 16.
 * Template pattern realization example
 * Pattern solves the problem of multiple copy (remove copy-paste)
 *
 * @author Evgeniy
 */
public class TemplateMethodApp {
    public static void main(String[] args) {

        C a = new A();
        a.templateMethod();

        System.out.println();

        C b = new B();
        b.templateMethod();
    }
}
