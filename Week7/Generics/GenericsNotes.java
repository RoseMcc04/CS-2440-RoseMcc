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
     * 
     * Java allows you to treat a wrapper variable as if it were a primitive 
     * with normal declarations. Integer x = new Integer(5); is declaring an
     * Integer object whereas Integer y = 7; will be used as a primitive by the
     * compiler. This is called an example of "autoboxing".
     * 
     * Integer z = x + y; We would now call this the process of "auto-unboxing".
     * This is because we would be using an Integer object in an arithmetic 
     * expression.
     */

    // Advantages/Disadvantages

    /*
     * Disadvantage --> some overhead involved in usage, and that extra work 
     * causes Java to be less efficient.
     * 
     * Advantage --> you can turn primitives into object when genetric 
     * containers are necessary. 
     */

    // Reason for Generics

    /*
     * Maybe we want to learn how to write a method for reversing the elements
     * in a 1D array structure. We could choose from many primitives: chars, 
     * doubles, bytes, float, booleans, etc. We could practice method 
     * overloading, or we could make the method generic. 
     * 
     * When we want the type to be generic, programmers will typically either
     * use 'T' or 'E' to denote the generic type. We then put this letter
     * inside of a set of angle brackets. 
     * 
     * The Java Virtual Machine (JVM) has guidelines on how to properly use
     * generic types. 
     * 
     * - You cannot use the "new" keyword to create an object of the generic
     *   type. 
     * 
     * - You cannot create an array of the generic type. 
     * 
     * These restructions occur due to erasure, a compilation technique. This
     * works in which the exact data type of a generic type in unknown at run
     * time when a generic method is running. 
     */

    // Why Generic Instead of Object?

    /*
     * Declaration --> public static <T> T process(T val) 
     *                 > public static Object process(Object val)
     * 
     * No casting! --> String s = process("vv"); 
     *                 vs. String s = (String) process("vv");
     */
}
