package patterns.behavioral.interpreter_pattern;

/**
 * Created on 14. February. 17.
 *
 * @author Evgeniy
 */
public class Context {
    Expression evaluate(String string){
        int position = string.length() - 1;

        while (position > 0){
            if (Character.isDigit(string.charAt(position))){
                position--;
            }
            else {
                Expression left = evaluate(string.substring(0, position));
                Expression right = new NumberExpression(Integer.
                        valueOf(string.substring(position + 1, string.length())));
                char operator = string.charAt(position);
                switch (operator){
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.valueOf(string);
        return new NumberExpression(result);
    }
}
