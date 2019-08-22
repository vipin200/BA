import java.util.ArrayList;

public class Bank {
    static ArrayList<BankAcc> arr;

    public Bank()
    {
        arr=new ArrayList<>();
    }
    public static void Add_acc(int acc_no,double balance)
    {
        BankAcc e=new BankAcc(acc_no,balance);
        arr.add(e);
    }
    static double total_bal()
    {
        double temp=0;
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            temp+=arr.get(i).get_bal();
        }
        return temp;
    }
}
