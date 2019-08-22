public class BankAcc {
    int  acc_no;
    double balance;
    public BankAcc(int ac,double bal)
    {
        acc_no=ac;
        balance=bal;
    }
    public void Deposit(double x)
    {
        balance+=x;
    }
    public void withdraw(double x)
    {
        balance-=x;
    }
    public int get_acc_no()
    {
        return acc_no;
    }
    public double get_bal()
    {
        return balance ;
    }
}
