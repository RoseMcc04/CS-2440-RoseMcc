package Week3.ObjectClass;

public class Dog implements Cloneable
{
    // Primary use of class is for examples in notes

    private String bark;
    private boolean fetch;

    /**
     * This is our no-arg constructor that initializes a Dog() object.
     */
    public Dog() 
    {
        bark = "";
        fetch = true;
    }

    /**
     * @param bark This is the barking String for the Dog.
     * @param fetch Whether the dog fetches or not
     */
    public Dog(String bark, boolean fetch) 
    {
        this.bark = bark;
        this.fetch = fetch;
    }

    /**
     * @param bark Sets the bark sound for the dog
     */
    public void setBark(String bark) 
    {
        this.bark = bark;
    }

    /**
     * @return Gets the bark sound for the dog
     */
    public String getBark() 
    {
        return this.bark;
    }

    /**
     * @param fetch Sets if the dog fetches or not
     */
    public void setFetch(boolean fetch) 
    {
        this.fetch = fetch;
    }
    
    /**
     * @return Gets whether the dog fetches or not
     */
    public boolean getFetch() 
    {
        return this.fetch;
    }

    /**
     * @return Returns a clone of the dog object
     */
    public Dog clone() 
    {
        Dog dog1;
        try 
        {
            dog1 = (Dog) super.clone();
        }
        catch (CloneNotSupportedException e) 
        {
            throw new RuntimeException("No Cloneable Implemented");
        }
        finally 
        {
            System.out.println("This example is over!");
        }
        return dog1;
    }

    /**
     * @return Returns if the objects are the same or not
     */
    public boolean equals(Dog dog) 
    {
        // instanceof helps determine if "dog" is an instance of the Dog class
        if (dog instanceof Dog) 
        {
            /*
             * another way is return Var.equals(((Dog)dog).getVar())
             * 
             * Var could be any field of the object we are looking at
             */

            Dog dog1 = (Dog) dog;
            return (dog1.bark == bark) && (dog1.fetch == fetch);
        }
        else 
        {
            return false;
        }
    }

    /**
     * @return Returns string describing the Dog
     */
    public String toString() 
    {
        return "Bark: " + this.bark + ", Fetch: " + this.fetch;
    }
}
