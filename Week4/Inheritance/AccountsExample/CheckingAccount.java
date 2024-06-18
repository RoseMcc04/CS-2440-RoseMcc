package Week4.Inheritance.AccountsExample;

public class CheckingAccount extends Account
{
    private double fee;

    public CheckingAccount() 
    {
        // super class no-arg constructor is called
        // balance is 0
        fee = 7.50;
    }

    /**
     * 
     */
    public void subtractFee() 
    {
        balance -= fee;
    }

    /**
     * @param amount
     */
    @Override
    public void withdraw(double amount) 
    {
        balance -= amount;
    }
}
