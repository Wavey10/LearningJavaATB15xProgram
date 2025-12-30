package Lab001_ex_level4;

import java.util.Scanner;

public class Reverse_Number {

    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the digits: ");
        int number=scanner.nextInt();
        int digits;
        int reversed=0;

        if(number==0)
        {
            System.out.println(number);
        }
        else if (number<0)
        {
            number = number*-1;
                while(number>0)
                {
                    digits=number%10;
                    reversed =reversed*10+digits;
                    number=number/10;
                }
                reversed=reversed*-1;
        }
        else {
            while(number>0)
            {
                digits=number%10;
                reversed =reversed*10+digits;
                number=number/10;
            }
        }

        System.out.println(reversed);
    scanner.close();
    }
}
