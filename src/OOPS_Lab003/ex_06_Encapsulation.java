package OOPS_Lab003;

public class ex_06_Encapsulation {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        b1.deposit(3000);
        b1.getBalance();
    }
}

class BankAccount
{
    private long balance;

    void deposit( long amount)
    {
        balance=balance+amount;
    }

    public long getBalance()
    {
        System.out.println(this.balance);
        return balance;
    }

}
