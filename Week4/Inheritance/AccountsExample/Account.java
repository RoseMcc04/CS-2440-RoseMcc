package Week4.Inheritance.AccountsExample;

public class Account 
{
    private long accountNumber;
    protected double balance;
    
    /**
     * 
     */
    public Account() 
    {
        accountNumber = 0;
        balance = 0.00;
    }

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

    /**
     * This method displays the account number with the balance.
     */
    public void display() 
    {
        System.out.println(accountNumber + " balance: $" + balance);
    }
}
