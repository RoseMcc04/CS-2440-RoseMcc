package Week4.Inheritance.AccountsExample;

public class App 
{
    public static void main(String[] args) 
    {
        CheckingAccount checking = new CheckingAccount();
        checking.deposit(50.00);
        checking.subtractFee();
        checking.display();

        SavingsAccount savings = new SavingsAccount();
        savings.deposit(20.00);
        savings.applyInterest();
        savings.display();
    }    
}
