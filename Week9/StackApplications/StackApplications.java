package Week9.StackApplications;

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
}
