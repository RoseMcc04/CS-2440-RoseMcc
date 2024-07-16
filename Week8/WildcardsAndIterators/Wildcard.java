package Week8.WildcardsAndIterators;

public class Wildcard 
{
    // Java Wildcards

    /*
     * There is a heirarchy of generic collection classes within the Java API, 
     * with a generic interface named Collection at the top. ArrayList, Vector, 
     * LinkedList, and many other collection classes implement Collection. 
     * However, there are times where we cannot use certain generic types based 
     * on the scope. This is where wildcards come in. 
     * 
     * The superclass of all kinda of collections is Collections<?>. The '?' is 
     * the symbol for a wildcard, which means that any type can be listed in the
     * collection. An example is provided below:
     * 
     * public static void printCollection(Collection<?> c) 
     * {
     *      for (Object e : c) 
     *      {
     *          System.out.println(e.toString());
     *      }
     * }
     * 
     * This technique allows us to safely assign elements from the collection 
     * of unknown to type Object since elements of any type are Objects. However, 
     * we cannot write a method that takes a parameter with an unknown type and 
     * add elements to it. This would procude a compilation error. 
     */

    // Comparable

    /*
     * Sometimes, we want to write a method thay receives an array of elements 
     * and sorts them in order. Sorting for ints, doubles, and Strings should
     * be about the same. It seems like we could use generics, but we need to 
     * be able to compare the things we are sorting. 
     * 
     * Objects are often compared to each other using compareTo(). However, not 
     * all classes implement the compareTo() method, and if the type is not valid, 
     * then our code will not work. 
     * 
     * Java allows a special suntax that allows us to specify that the generic must
     * implement a certain interface: 
     * 
     * public static <T extends Comparable<? super T>> void sort(T[] arrayToSort)
     * {
     *      // code for sort
     * }
     * 
     * The "weird" part in the set of brackets is saying that the sort method is 
     * a generic method, the generic type is T, and that whatever type we substitute
     * for T must either implement Comparable<T> itself, or a subclass of T implements
     * the Comparable<T> interface.
     * 
     * We can also write generic classes that hold a similar requirement: 
     * 
     * public class SortedList<E extends Comparable<? super E>>
     */

    // Generic Interfaces

    /*
     * Generic interfaces are not much different from regular interfaces, except a
     * class that implements a generic interface must be generic in itself. An 
     * example would be the Iterator<E> interface. Any class that implements the
     * Iterator interface must implement the following methods:
     * 
     * public boolean hasNext()
     * public E next()
     * public void remove()
     */
}
