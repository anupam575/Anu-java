package In.kgcoding;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount ("001",
                "prashant");
        account.depositMoney(10000);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);

    }
}
