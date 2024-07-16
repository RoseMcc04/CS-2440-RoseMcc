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
}
