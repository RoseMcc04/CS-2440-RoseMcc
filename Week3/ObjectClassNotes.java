package Week3;

// Found in the java.lang package and sits at top of class heirarchy tree
// Every class is a descendent, direct or indirect, of the Object class
import java.lang.Object;

public class ObjectClassNotes
{
    /**
     * 
     */
    public static void main(String[] args) 
    {
        Dog dog = new Dog("arf arf arf", true);
        Dog dog1 = dog.clone();
        System.out.println(dog.getFetch() + "\n");
        System.out.println(dog1.getFetch());
    }

    /*
     * Every class used inherits the instance methods of Object. You may
     * not need them regularly, but learning how to override them can make
     * your code powerful.
     */

    /*
     * The following methods are inherited from Object...
     * 
     * public boolean equals(Object obj) --> indicates whether some other object
     * is equal to the input
     * 
     * protected void finalize() throws Throwable --> called by the garbage
     * collector on an object when garbage collection determines there are 
     * no more references to the object 
     * 
     * protected Object clone() throws CloneNotSupportedException --> creates 
     * and returns a copy of the object
     * 
     * public final Class getClass() --> returns the runtime class of an object
     * 
     * public int hashCode() --> returns a hashcode value of an object
     * 
     * public String toString() --> returns a String representation of an object
     */

    // Clone:
    /*
     * clone() will implement the Cloneable interface
     * 
     * Object's use of the clone method creates an object with the same class
     * as the original object; initializes new object's member variables to have
     * the same values as the original object's member variables
     * 
     * for class header, write "implements Cloneable"
     * 
     * We will now write an actual clone method
     */

    // Deep Copy vs Shallow Copy
    /*
     * Means the original object and the clone are not independent
     * 
     * Decoupling them requires you to override the clone so that it clones 
     * the object and ObjExternal; Then, the original object references 
     * ObjExternal
     * 
     * The clone references a clone of ObjExternal, so that the object and its
     * clone are truly independent
     * 
     * Shallow copy is stored in the same spot in memory, Deep copy is different
     */

    // Equals() method
    /*
     * Compares two objects for equality and returns true if they are equal; 
     * method provided by the Object class uses == to determine whether the 
     * two objects are equal
     * 
     * Works primarily for primitive types, but for Objects, it checks if the 
     * reference values are equal or not
     */
}
