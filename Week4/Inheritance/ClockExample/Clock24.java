package Week4.Inheritance.ClockExample;

public class Clock24 extends Clock
{
    /**
     * @return Returns the hour on the 24-hour clock
     */
    public int getHour() 
    {
        int ordinaryHour = super.getHour();
        if (isMorning()) 
        {
            if (ordinaryHour == 12) 
            {
                return 0;
            }
            else 
            {
                return ordinaryHour;
            }
        }
        else 
        {
            if (ordinaryHour == 12) 
            {
                return 12;
            }
            else 
            {
                return ordinaryHour + 12;
            }
        }
    }
}
