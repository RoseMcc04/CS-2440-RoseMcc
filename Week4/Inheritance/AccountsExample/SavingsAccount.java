package Week4.Inheritance.AccountsExample;

public class SavingsAccount extends Account;
{
    private double interestRate;

    public SavingsAccount() 
    {
        interestRate = 0.03;
    }

    public void applyInterest() 
    {
        balance += balance * interestRate;
    }
}
