package Week4.Inheritance.AccountsExample;

public class SavingsAccount extends Account
{
    private double interestRate;

    public SavingsAccount() 
    {
        interestRate = 0.03;
    }

    public double applyInterest() 
    {
        return balance += balance * interestRate;
    }

    public void display() 
    {
        System.out.println("Balance: " + balance + ", Rate: " + interestRate);
    }
}
