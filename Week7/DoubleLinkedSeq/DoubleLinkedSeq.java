package Week7.DoubleLinkedSeq;

/**
 * @author Rose McCormack
 * @version 9 July 2024
 */
public class DoubleLinkedSeq 
{
    // Fields
    
    /*
     * manyNodes --> keeps track of the number of nodes
     * head --> reference to the head node
     * tail --> reference to the tail node
     * cursor --> reference to node with current element, or null if no 
     *            current element
     * precursor --> reference to node before current element, or null if
     *               no current element
     */

     // Invariants

     /*
      * 1. The elements in the sequence are stored in a linked list.
      *
      * 2. The head reference is stored in the instance variable, head.
      *
      * 3. The tail reference is stored in the instance variable, tail.
      *
      * 4. The current item's reference is stored in the instance variable, 
      *    cursor. If there is not current item, cursor is null.
      *
      * 5. The instance variable, precursor, always is the address of the node
      *    just prior to the node that cursor references, unless cursor is null
      *    or equal to head. In those cases, precursor is null.
      *
      * 6. If the sequence is empty, all the references are null.
      *
      * 7. The number of elements in the sequence is stored in the instance
      *    variable, manyNodes. 
      */

      // isCurrent()

      /*
       * One of the methods is isCurrent(). It returns true if there is a 
       * current item, and false otherwise. How can we detect if there is no
       * current item? 
       * 
       * if (cursor == null)
       *    return false
       * else
       *    return true
       * 
       * or 
       * 
       * return cursor == null
       */

       // addBefore() 

       /*
        * We will look at ultiple cases in which the reference fields will
        * have to change. We will check the conditions in the order they are
        * listed. 
        * 
        * if list is empty: 
        *   head, tail, and cursor change
        * else if current is null or current is head
        *   head and cursor change
        * else
        *   add element after precursor, cursor changes
        */

        // removeCurrent()

        /*
         * We have to be careful when checking cases in which to remove the
         * current element from a sequence. Pictures should be drawn to 
         * understand the changes in certain circumstances. 
         * 
         * if there is only one element:
         *      head, tail, and cursor change
         * else if current is first
         *      head and cursor change
         * else if current at end
         *      precursor, cursor, and tail change
         * else
         *      cursor changes
         */

        // addAfter()

        /*
         * We have to consider the cases in which addAfter should be used. We
         * have to list them in order we will check them and look at changed
         * references within each case.
         */
}
