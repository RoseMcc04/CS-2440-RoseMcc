package Week4.Inheritance.ClockExample;

public class CuckooClock extends Clock
{
    /**
     * @return Returns if the cuckoo clock is cuckooing or not
     */
    public boolean isCuckooing() 
    {
        if (getMinute() == 0) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
