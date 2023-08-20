package root.ast.expressions;

import root.LocalizedToken;

/**
 * An expression that returns null, the "null" literal. This is another deviation from the
 * Monkey spec but If the language is going to have null values, there should be a way to
 * produce them and assign them to variables with a simple syntax like "let a = null;". In the
 * current Monkey spec, the only way to get null is something like "let a = if (false) {}"
 * or "let a = fn(){}()" which is pretty ugly.
 * <p>
 * I also changed the way null behaves, trying to make it a little more safe: the -
 * operation on null evaluates to null, and all infix (except == and !=) operations where one
 * side is null evaluate to null. Is this a good idea? I don't know, just experimenting.
 * For the equality operator, only null == null evaluates to true. All other comparisons
 * with null return false
 */
public class NullLiteralExpression extends Expression {

    public NullLiteralExpression(LocalizedToken token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "null";
    }
}
