package Week9.StackApplications;

/**
 * @author Rose Adriana McCormack
 * @version 23 July 2024
 */
public class StackApplications 
{
    // Infix Notation

    /*
     * - Operators written in between operands
     * - Ex. A * (B + C) / D ==> "First add B and C together, multiply by A
     *   and then divide all of that by D"
     * - We have rules (PEMDAS) to help us perform these calculations
     */

    // Postfix Notation

    /*
     * - Operators are written after their operands
     * - Ex. A B C + * D /
     * - Order of operations is also left-to-right, and prackets cannot be
     *   used to change this order. Because '+' is before the '*', it is the
     *   first operation performed. Operands act on values immediately to the
     *   left of them. We can make this more explicit: ( (A (B C +) *) D /)
     */

    // Prefix Notation

    /*
     * - Operators are written before their operands. 
     * - Ex. / * A + B C D
     * - Order of operations are right-to-left and the operators act on 
     *   the two nearest values to the right. We can make this more explicit: 
     *   (/ (* A(+ B C)) D)
     * - Although prefix operators are "left-to-right", they use values to 
     *   their right, and if these values themselves involve computations, then
     *   this changes the order that the operators have to be evaluated in. 
     */

    // Practice 1:

    /*
     * 1. ((4 + 5) * (3 - (8 / 4)))
     *  - Prefix: * + 4 5 - 3 / 8 4
     *  - Postfix: 4 5 + 3 8 4 / - *
     * 
     * 2. ((8 - (5 * 2)) + (4 * 6))
     *   - Prefix: + - 8 * 5 2 * 4 6
     *   - Postfix: 8 5 2 * - 4 6 * +
     */

    // Evaluating Postfix

    /*
     * Initialize a stack of double numbers
     * while there is more of the expression to read
     *      if next input is a number
     *          read next input and push it onto the stack
     *      else
     *          read next char which is an operation symbol
     *          pop two numbers off of the stack
     *          combine the numbers with the operation (second number popped
     *          is left operand)
     *          push subsequent result onto stack
     */

    // Converting Infix to Postfix

    /*
     * Initialize a stack of chars to hold operations and parentheses while 
     * there is more of the expression to read
     * while there is more of the expression to read
     *      if next input is a number
     *          read the number and write it to output followed by a space
     *      else
     *          read the next symbol
     *          if symbol is '('
     *              push it onto stack
     *          else if symbol is an operator
     *              while stack is not empty and char at top of stack is not 
     *              '(' and operator at top of stack has equal or higher 
     *              precedence than the symbol
     *                  pop operator off of stack and write it to output
     *              push symbol onto the stack
     *          else if symbol is ')'
     *              while stack is not empty and char is not '('
     *                  pop operator off the stack and write to output
     *              pop stack and discard '('
     *          else
     *              there is an error
     * while stack is not empty
     *      pop stack and write to output
     */
}
