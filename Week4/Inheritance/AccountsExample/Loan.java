package Week4.Inheritance.AccountsExample;

public class Loan extends Account, implements Interest 
{
    @Override
    public void display() 
    {
        throw new UnsupportedOperationException("Unsupported Operation");
    }

    @Override
    public void applyInterest() 
    {
        throw new UnsupportedOperationException("Unsupported Operation");
    }
}
