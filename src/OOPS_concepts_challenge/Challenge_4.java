package OOPS_concepts_challenge;

public class Challenge_4
{
    public static void main(String[] args)
    {
        BankAccount b1 =new BankAccount(5000);

        if(b1.deposit(2000))
            System.out.println("Deposit successful");

        if(b1.withdraw(1000))
            System.out.println("Withdraw successful");

        System.out.println("Current balance:"+b1.getBalance());

        }
    }

class BankAccount
{
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public boolean deposit(int amount)
    {
        if(amount<=0) {
            return false;
        }
        else {
            balance = balance + amount;
            return true;
        }
    }

    public boolean withdraw(int amount)
    {
        if(amount<=0 || amount>balance)
        {
            return false;
        }
        else {
            balance-=amount;
            return true;
        }
    }

    public int getBalance()
    {
        return balance;
    }

}
