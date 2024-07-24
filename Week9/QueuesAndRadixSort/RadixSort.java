package Week9.QueuesAndRadixSort;

import java.util.Queue;
import java.util.LinkedList;

/**
 * @author Rose McCormack
 * @version 23 July 2024
 */
public class RadixSort 
{
    // Introduction
    

    /*
     * A radix sort can be used to sort data such as telephone numbers, zip
     * codes, product ids, and so sorth. The data is fixed in length an composed
     * of a known set of characters or digits. It is usually implemented either
     * with an array of queues, each of which is a bucket/bin. It will better 
     * enable us to describe the steps of the algortihm if we describe the input
     * mathematically as follows...
     * 
     * Suppose we are sorting a list of fixed-length integers. Suppose each integer
     * is composed of m digits. We can think of each integer as having the form dm-1, 
     * dm-2, ... d2, d1, d0, where dm-1 is the most significant digit and d0 is the
     * least. 
     */

    /**
     * @param args This is the main method for our radix sort. We will implement
     * the sort in here. 
     */
    public static void main(String[] args) 
    {
        Queue<Integer> data = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) 
        {
            data.add((int) (Math.random() * 999) + 1);
        }
        System.out.println(data);
        System.out.println();
        data = radixSort(data);
        System.out.println(data);
    }

    /**
     * @param data Queue of data that will be sorted with the radix sort
     */
    @SuppressWarnings("unchecked")
    public static Queue<Integer> radixSort(Queue<Integer> data) 
    {
        // make buckets
        Queue<Integer>[] bucket = new LinkedList[10];
        for (int i = 0; i < 10; i++) 
        {
            bucket[i] = new LinkedList<Integer>();
        }
        int index;
        int x;
        int placeValue = 1; // starting in one's column
        for (int stage = 0; stage < 3; stage++) // for each digit
        {
            // distribute the values into the buckets
            while (data.size() > 0) 
            {
                x = data.remove();
                index = x / placeValue % 10;
                bucket[index].add(x);
            }
            // empty buckets and reassemble the queue
            for (int i = 0; i < 10; i++) 
            {
                while (bucket[i].size() > 0) 
                {
                    data.add(bucket[i].remove());
                }
            }
            placeValue *= 10; // go to next column
        }
        return data;
    }

    // Syntax Note

    /*
     * Arrays of Stacks or Queues or LinkedLists are very useful. Java gives 
     * compile time errors when we try to create arrays of generic types. We
     * can do the following:
     * 
     * Queue<Integer> bucket = new LinkedList[10];
     * bucket[i] = new LinkedList<Integer>();
     */
}
