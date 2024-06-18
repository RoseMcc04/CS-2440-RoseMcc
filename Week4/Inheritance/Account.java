package Week4.Inheritance;

public class Account 
{
    private String accountNumber;
    private double balance;
    
    /**
     * @param accountNumber
     * @param balance
     */
    public Account(String accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * @param amount
     */
    public void deposit(double amount) 
    {
        balance += amount;
    }

    /**
     * @param amount
     */
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
        }
    }
}
