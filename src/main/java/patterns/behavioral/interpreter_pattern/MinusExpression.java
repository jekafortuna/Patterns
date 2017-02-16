package patterns.behavioral.interpreter_pattern;

/**
 * Created on 13. February. 17.
 *
 * @author Evgeniy
 */
public class MinusExpression implements Expression {
    private Expression left;
    private Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
