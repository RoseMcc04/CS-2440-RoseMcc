package Week4.Inheritance.AccountsExample;

public class CheckingAccount extends Account
{
    private double fee;

    public CheckingAccount() 
    {
        // super class no-arg constructor is called
        // balance is 0
        fee = 0;
    }

    /**
     * 
     */
    public void subtractFee() 
    {
        balance -= fee;
    }

    /**
     * 
     */
    @Override
    public void withdraw(double amount) 
    {
        
    }
}
