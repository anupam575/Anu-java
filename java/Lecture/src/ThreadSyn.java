import java.util.Scanner;

class Account {
    int bal;

    Account(int b)// parametrize constructor
    {
        bal = b;
    }

    boolean isSufficientBal(int w) {
        if (bal > w) {
            return true;
        } else {
            return false;
        }


    }

   void withdraw(int amt) {

        bal = bal - amt;
        System.out.println("Transaction Successfully ");
        System.out.println("Current Balance is " + bal);
    }
}
class Customer implements Runnable
{
    Account x1;
    Customer(Account j1)
    {
        x1=j1;
    }

    @Override
    public void run() {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter amount to withdraw for:");
        int amt=s1.nextInt();
        if(x1.isSufficientBal(amt))
        {
            x1.withdraw(amt);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}






public class ThreadSyn {
    public static void main(String[] args) {
        Account a1=new Account(5000);
        Customer c1=new Customer(a1);
        Customer c2=new Customer(a1);
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();

    }
}
