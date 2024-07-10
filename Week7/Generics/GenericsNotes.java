package Week7.Generics;

/**
 * @author Rose McCormack
 * @version 10 July 2024
 */
public class GenericsNotes 
{
    // Context

    /*
     * There are eight primitive types in Java.
     * 
     * 1. byte
     * 2. short
     * 3. int
     * 4. long
     * 5. float
     * 6. double
     * 7. char
     * 8. boolean
     * 
     * However, everything else is just an object. All objects are part of a 
     * heirarchy of Java objects and are all subclasses of the Object class. We
     * have previously discussed methods of the Object class that are 
     * inherited by all other classes but often have to be overidden to be
     * useful. (Ex. equals(), toString(), compareTo(), hashCode())
     */

    // Container Classes

    /*
     * In the Java library, we have useful container classes like ArrayList, 
     * LinkedList, and Vector which are all generic classes. When declaring 
     * a generic object, you have to explain to Java which wrapper type you
     * desire the structure to use. An example is...
     * 
     * ArrayList<String> a = new ArrayList<String>();
     * 
     * The type is supplied in angle brackets. Any type other than primitives
     * will work. In terms of primitives, you will use their respective
     * wrapper classes instead. Each primitive has a corresponding wrapper 
     * class.
     * 
     * byte --> Byte; short --> Short; int --> Integer; long --> Long, 
     * float --> Float; double --> Double; char --> Character; 
     * boolean --> boolean
     */
}
