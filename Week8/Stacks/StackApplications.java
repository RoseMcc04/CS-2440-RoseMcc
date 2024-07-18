package Week8.Stacks;

// Import generic collection for Stack data structure
import java.util.Stack;

/**
 * @author Rose McCormack
 * @version 18 July 2024
 */
public class StackApplications 
{
    // Example: Balanced Parentheses

    /*
     * We will make an algorithm that checks an expression to see if the 
     * parentheses match correctly. It allows three kinds of parentheses: (), 
     * [], and {}. Any other symbols are ignored. 
     * 
     * Ex. 1: "{[X + Y*(Z + 7)]*(A + B)}" --> returns true since each of the
     * left parentheses corresponds to a right parentheses
     * 
     * Ex. 2: "((X + Y*(Z + 7)*[A + B])" --> returns false since one of the
     * parentheses is missing its right counterpart
     */

    /**
     * @param expression String input the user wants to see if it is balanced 
     * or not
     * @return This method returns if the String input is balanced or not.
     */
    public static boolean isBalanced(String expression) 
    {
        /*
         * Postcondition: A true return value indicates that the parentheses in
         * the given expression are balanced. Otherwise, the return value is 
         * false.
         * 
         * Characters other than  (), {}, and [] are ignored. 
         */

        // Char Names for Stack object
        final char LEFT_NORMAL = '(';
        final char RIGHT_NORMAL = ')';
        final char LEFT_CURLY = '{';
        final char RIGHT_CURLY = '}';
        final char LEFT_SQUARE = '[';
        final char RIGHT_SQUARE = ']';

        // from java.util.Stack
        Stack<Character> store = new Stack<Character>();
        // An index into the String
        int i;
        // Change to true for mismatch
        boolean failed = false;

        for (i = 0; !failed && (i < expression.length()); i++) 
        {
            switch (expression.charAt(i)) 
            {
                case LEFT_NORMAL:
                case LEFT_CURLY:
                case LEFT_SQUARE:
                    store.push(expression.charAt(i));
                    break;
                case RIGHT_NORMAL:
                    if (store.isEmpty() || (store.pop() != LEFT_NORMAL)) 
                    {
                        failed = true;
                    }
                    break;
                case RIGHT_CURLY:
                    if (store.isEmpty() || (store.pop() != LEFT_CURLY)) 
                    {
                        failed = true;
                    }
                    break;
                case RIGHT_SQUARE:
                    if (store.isEmpty() || (store.pop() != LEFT_SQUARE)) 
                    {
                        failed = true;
                    }
                    break;
            }
        }
        return (store.isEmpty() && !failed);
    }
}
