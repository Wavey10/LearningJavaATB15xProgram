package Lab001_ex_level4;

import java.util.Scanner;

public class Palindrome_number {

    static void main()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter some digits: ");
        int number= scanner.nextInt();
        int n=number;
        int digits;
        int reversed=0;

        while(n>0)
        {
            digits=n%10;
            reversed=reversed*10 + digits;
           // System.out.println(reversed);
            n=n/10;
        }
        
        if(number==reversed)
        {
            System.out.printf("It is a palindrome number ,the initial input is %d and the reversed value is %d", number,reversed);
        } else  {
            System.out.println("It is not a panlindrome number");
        }
scanner.close();
    }
}
