package Week8.Stacks;

/**
 * @author Rose McCormack
 * @version 18 July 2024
 */
public class Stacks 
{
    // Introduction 

    /*
     * A stack is a data structure of ordered items such that items can be 
     * inserted and only removed at the end (called thed top). Stacks follow
     * the LIFO (Last In, First Out) principle.
     * 
     *             Pop
     *              ^
     *             -
     *            -
     * Push --> [top node] --> [node] --> [node] --> [node]
     *          ^
     *         -
     *        -
     *   Stack Pointer
     */

    // Generic Specification of a Stack

    /*
     * public boolean isEmpty()
     * 
     * public E peek()
     * 
     * public E pop()
     * 
     * public void push(E item)
     * 
     * public int size()
     */

    // More Notes on Stacks

    /*
     * If a user attempts to peek() or pop() an empty stack, it results in an
     * error condition called stack underflow. There is an exception in Java
     * called EmptyStackException that we will throw from our implementations 
     * of peek() and pop(). 
     * 
     * Stacks are useful, but the extent of their scope will be covered in 
     * future coursework.  
     */

    // Further Into Specification

    /*
     * public Stack()
     *      - Initializes an empty stack
     * 
     * public boolean isEmpty()
     *      - Determines if the stack is empty
     *      - If empty return true, otherwise false
     * 
     * public E peek()
     *      - Gets the top item of the stack without removing it
     *      - Returns the top item in the stack
     *      - Throws EmptyStackException if empty
     * 
     * public E pop()
     *      - Gets the top item and removes it from the stack
     *      - Returns the value of the top item and deletes it
     *      - Throws EmptyStackException if empty
     * 
     * public void push(E item)
     *      - Pushes an item into the stack
     *      - Throws OutOfMemoryError if there is insufficient memory
     * 
     * public int size()
     *      - Accessor method to determine the number of items in this stack
     *      - Returns the number of items in the stack
     * 
     * We can perform the following import as well --> java.util.EmptyStackException
     */
}
