package ex_switch_case;

import java.util.Scanner;

public class Ex04AtmMenu {

    public static void main(String[] args)
    {
        double balance=10000;
        Scanner scanner=new Scanner(System.in);
        int number;
        do{
            System.out.println("Please enter the number based on the needs:\n1:Balance\n2:Deposit\n3:Withdraw\n4:Exit\n");

            number=scanner.nextInt();

            switch (number)
            {
                case 1 :
                    System.out.println("This is your balance amount: "+ balance);
                    break;
                case 2 :
                    System.out.println("Please enter the amount to be deposited:");
                    int depositedAmount=scanner.nextInt();
                    if(depositedAmount<=0)
                    {
                        System.out.println("Invalid Amount");
                    }
                    else {
                        balance=balance+depositedAmount;
                        System.out.println("Deposited amount is:"+depositedAmount);
                        System.out.println("Total balance is:"+ (balance));
                    }
                    break;
                case 3 :
                    System.out.println("Kindly enter the withdrawal amount:");
                    int withdrawalAmount=scanner.nextInt();
                    if(withdrawalAmount<=0)
                    {
                        System.out.println("Invalid withdrawal amount");
                    }
                    else if(withdrawalAmount>balance)
                    {
                        System.out.println("Amount is higher than the balance");
                    }
                    else {
                        balance=balance-withdrawalAmount;
                        System.out.println("Amount is withdrawn");
                        System.out.println("Remaining balance is:"+ (balance-withdrawalAmount));
                    }
                    break;
                case 4 :
                    System.out.println("Thank you for using ATM.");
                    System.out.println("End of transaction.");
                    break;
                default :
                    System.out.println("Invalid option.Please enter one of the option from the Menu");
                    break;
            }
        }while(number!=4);

        scanner.close();
    }
}
