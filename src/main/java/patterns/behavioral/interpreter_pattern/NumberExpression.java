package patterns.behavioral.interpreter_pattern;

/**
 * Created on 13. February. 17.
 * Terminal expression
 *
 * @author Evgeniy
 */
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
