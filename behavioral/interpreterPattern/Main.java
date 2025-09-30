package behavioral.interpreterPattern;
// Client
import java.util.Stack;

public class Main {
    // Builds an expression tree and interprets it
    public static Expression buildInterpreterTree(String expression) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.equals("+")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new AddExpression(left, right));
            } else if (token.equals("-")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new SubtractExpression(left, right));
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        // Expression in Reverse Polish Notation: "5 10 + 3 -"
        String expression = "5 15 + 3 -";
        Expression exp = buildInterpreterTree(expression);

        System.out.println("Result: " + exp.interpret()); // Output: 12
    }
}