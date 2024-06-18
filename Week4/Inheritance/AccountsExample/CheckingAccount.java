package Week4.Inheritance.AccountsExample;

public class CheckingAccount extends Account
{
    private double fee;

    public CheckingAccount(double fee) 
    {
        this.fee = fee;
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

    public void display() 
    {
        System.out.println("Balance: " + balance + ", Fee: " + fee);
    }
}
