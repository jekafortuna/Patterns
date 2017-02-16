package patterns.behavioral.interpreter_pattern;

/**
 * Created on 13. February. 17.
 * Interpreter pattern realization example
 *
 * @author Evgeniy
 */
public class InterpreterApp {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("-1-12+35");
        System.out.println(expression.interpret());
    }
}
