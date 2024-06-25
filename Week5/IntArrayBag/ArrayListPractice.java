package Week5.IntArrayBag;

import java.util.ArrayList;

public class ArrayListPractice 
{
    /*
    We are going to look at the ArrayList container. It is a list structure
    that is mutable. It is a similar object to a Vector, but is unsynchronized.
    This means that if multiple threads access an ArrayList at the same 
    occurance, one of the threads modifies the structure of the list, and it 
    must be synchronized externally. This can be adds an element, deletes an
    element, or resizes the structure.
    */

    /**
     * @param args This is our main method we used to demonstrate the ArrayList
     * container class.
     */
    public static void main(String[] args) 
    {
        // Declare and initialize list structure to activate methods
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(5);
        newList.add(7);
        newList.add(2);
        newList.add(7);
        newList.add(6);
        newList.add(9);
        newList.add(1);
        newList.add(8);
        newList.add(3);
        newList.add(4);

        // We will add an element to the list
        ArrayList<Integer> addedToList = newList;
        addedToList.add(2);
        System.out.println("addedToList: " + addedToList.toString());

        // We will clone our arrayList object
        // Does not print anything
        ArrayList<Integer> clonedList = newList;
        clonedList.clone();
        System.out.println("clonedList: " + clonedList.toString());

        // We will see if the list contains a '1'
        ArrayList<Integer> containsOne = newList;
        System.out.println("containsOne: " + containsOne.contains(1));

        
    }
}
