package Week3.ObjectClass;

// Found in the java.lang package and sits at top of class heirarchy tree
// Every class is a descendent, direct or indirect, of the Object class
public class ObjectClassNotes
{
    /**
     * 
     */
    public static void main(String[] args) 
    {
        Dog dog = new Dog("arf arf arf", true);
        // Implementing clone() method for Dog dog1
        Dog dog1 = dog.clone();
        Dog dog2 = new Dog("arf arf arf", false);
        // Implementing equals() method for logical comparisons
        System.out.println(dog.equals(dog1));
        System.out.println(dog.equals(dog2));
        System.out.println(dog1.equals(dog2));
        // Implementing toString() to see results
        System.out.println(dog.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
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

    // clone():
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

    // Deep Copy vs Shallow Copy:
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

    // equals():
    /*
     * Compares two objects for equality and returns true if they are equal; 
     * method provided by the Object class uses == to determine whether the 
     * two objects are equal
     * 
     * Works primarily for primitive types, but for Objects, it checks if the 
     * reference values are equal or not
     */

    // HashCode():
    /*
     * Not too worried for now since this is CS 2440 and not CS 3460
     * 
     * We do understand that HashCode returns the HashCode of an Object, but we
     * are not in that scope yet.
     */

    // toString():
    /*
     * extremely useful, particularly in debugging
     * 
     * If you send an object reference to the System.out.println() method, 
     * Java calls the toString() method on that object and prints the String
     * that gets returned
     * 
     * For general Object toString(), the method will return '@' and then a
     * hexidecimal representation of the object, however, this is not useful
     * 
     * This means that we can create toString() methods in another class
     */
}
