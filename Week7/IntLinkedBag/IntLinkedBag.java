package Week7.IntLinkedBag;

/**
 * @author Rose McCormack
 * @version 9 July 2024
 */
public class IntLinkedBag 
{
    // Introduction

    /*
     * Back in Week 5, we covered the IntArrayBag class. We are using the
     * same specification along with a few newer methods. We will learn how to
     * implement these, along with looking at the algorithmic complexities
     * to observe worst-case scenarios of collections-related methods. 
     */

     // Fields

     /*
      * Two instance variables --> head and manyNodes
      * Invariants --> 
      *     - Elements in the bag are stored in a linked list
      *     - Head reference of list is stored in the instance variable head
      *     - Total number of elements is stored in manyNodes
      */

      // Clarification

      /*
       * What values should head and manyNodes have when the bag is empty?
       *    - null, 0
       * 
       * Why do we have a field for manynodes when where is a method in the
       * IntNode class to compute the length of a list? There is a size method 
       * in IntLinkedBag. Which should I use?
       *    - It is inefficnet to walk the list and count nodes. The size
       *      method should just return manyNodes.
       * 
       * Does the IntLinkedBag class need to perform a deep copy in the clone
       * method, or is super.clone enough?
       *    - It needs to perform a deep copy (list will need to be copied)
       * 
       * IntLinkedBag uses methods from IntNode for many of its tasks.
       *    - listCopy method --> IntNode.listCopy(head)
       */

       // Results - Remove Method

       /*
        * Recall the parameter, remove, is the item to remove and the item has
        * to be found before it can be removed.
        *    - listSearch: IntNode n = IntNode.listSearch(head, target);
        *
        * With IntArrayBag, we removed an element by replacing it with the 
        * last element in the array and decrement manyNodes by 1. 
        *
        * It replaces the data with the data in the head node and then removes
        * the head node.
        *
        * targetNode = IntNode.listSearch(head, target);
        * if (targetNode == full) return false;
        * else
        * {
        *    targetNode.setData(head.getData());
        *    head = head.getLink();
        *    manyNodes--;
        *    return true;
        * }
        */

        // Count Occurrences (Without listSearch)

        /*
         * With listSearch --> 
         * 
         * public int countOccurrences(int target) 
         * {
         *      int answer;
         *      IntNode cursor;
         * 
         *      answer = 0;
         *      cursor = IntNode.listSearch(head, target);
         *      while (cursor != null) 
         *      {
         *          // Each time that cursor is not null, we have another 
         *          // occurrence of target, so we add to answer and then move 
         *          // cursor to the next occurrence of the target.
         *          answer++;
         *          cursor = cursor.getLink();
         *          cursor = IntNode.listSearch(cursor, target);
         *      }
         *      return answer;
         * }
         * 
         * Without listSearch --> 
         * 
         * public int countOccurrences(int target)
         * {
         *      int answer = 0;
         *      IntNode cursor = head;
         *      while (cursor != null) 
         *      {
         *          if (cursor.getData() == target) 
         *          {
         *              answer++;
         *          }
         *          cursor = cursor.getLink();
         *      }
         *      return answer;
         * }
         */

        // Grab 

        /*
         * The grab method retrieves a random number between 1 and manyNodes, 
         * then traverses to said node and returns the data.
         */

        // New Elements
        /*
         * New elements are added to the head due to the efficiency of the 
         * task.
         */

        // Union and AddAll

        /*
         * Union --> static method; passes in two bags and returns their 
         *           union
         * 
         * AddAll --> non-static method; invoked on a bag and adds contents of
         *            parameter bag to the calling bag
         */

        // Advantages/Disadvantages

        /*
         * You do not have to resize a linked list, however, random access
         * is not possible unlike the array bag.
         */
}
