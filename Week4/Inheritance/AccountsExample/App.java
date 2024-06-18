package Week4.Inheritance.AccountsExample;

import java.util.ArrayList;
public class App 
{
    public static void main(String[] args) 
    {
        CheckingAccount checking = new CheckingAccount(6.75);
        checking.deposit(50.00);
        checking.subtractFee();
        checking.display();

        SavingsAccount savings = new SavingsAccount();
        savings.deposit(20.00);
        savings.applyInterest();
        savings.display();

        ArrayList<Account> list = new ArrayList<>();
        list.add(checking);
        list.add(savings);
        System.out.println(list.toString());
    }   
}
