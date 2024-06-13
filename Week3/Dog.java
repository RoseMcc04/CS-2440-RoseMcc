package Week3;

public class Dog 
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
}
