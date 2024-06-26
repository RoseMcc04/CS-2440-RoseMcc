package Week4.Inheritance.ClockExample;

import java.util.Vector;
import java.util.ArrayList;

public class Clock 
{
    private int hour;
    private int minute;
    private boolean morning;

    /**
     * This is the no-arg constructor for the Clock class.
     */
    public Clock() 
    {
        hour = 0;
        minute = 0;
        morning = true;
    }

    /**
     * @param hour The number for the hour
     * @param minute The number for the minute
     * @param morning Determines if it is morning or not morning
     */
    public Clock(int hour, int minute, boolean morning) 
    {
        this.hour = hour;
        this.minute = minute;
        this.morning = morning;
    }

    /**
     * @param args This is the main method of Clock.java
     */
    public static void main(String[] args) 
    {
        // A subclass may be used where the superclass is expected
        CuckooClock cuckoo = new CuckooClock();
        cuckoo.setTime(10, 0, true);
        System.out.println(cuckoo.isCuckooing());

        ArrayList<Clock> clocks = new ArrayList<>();
        clocks.add(cuckoo);
        System.out.println(clocks.toString());
    }

    /**
     * @param minutes The number of minutes added to the time.
     */
    public void advance(int minutes) 
    {
        this.minute += minutes;
    }

    /**
     * @param c1 First Clock object
     * @param c2 Second Clock object
     * @return Returns if c1 is earlier than c2 or not
     */
    public boolean earlier(Clock c1, Clock c2) 
    {
        if (c1.equals(c2)) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    /**
     * @return Returns the hour of the time of the clock object.
     */
    public int getHour() 
    {
        return this.hour;
    }

    /**
     * @return Returns the minutes of the time of the block object.
     */
    public int getMinute() 
    {
        return this.minute;
    }

    /**
     * @return Returns if it is morning or not.
     */
    public boolean isMorning() 
    {
        return this.morning;
    }

    /**
     * @param hour The number for the hour
     * @param minute The number of minutes
     * @param morning Determines if it is morning or not morning
     */
    public void setTime(int hour, int minute, boolean morning) 
    {
        this.hour = hour;
        this.minute = minute;
        this.morning = morning;
    }

    /**
     * @param clocks A vector of Clock objects
     * @return Returns if some Clocks are timed in the morning or not
     */
    public ArrayList<Clock> someMorning(Vector<Clock> clocks) 
    {
        ArrayList<Clock> newList = new ArrayList<>();
        for (int i = 0; i < clocks.size(); i++) 
        {
            if (clocks.get(i).isMorning()) 
            {
                newList.add(clocks.get(i));
            }
        }
        return newList;
    }
}
