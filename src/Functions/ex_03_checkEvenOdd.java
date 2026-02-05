package Functions;

import java.util.Scanner;

public class ex_03_checkEvenOdd {

    static void main() {

        Scanner scanner=new Scanner(System.in);
        int a= readInt(scanner,"Enter the number:");
        checkEvenOdd(a);
    }

    static int readInt(Scanner scanner,String msg)
    {
if(scanner.hasNextInt())
{
    return  scanner.nextInt();
}else {
    System.out.println("Enter int only!");
    return 0;
}
    }

    private static void checkEvenOdd(int a) {
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else {
            System.out.println("THe number is odd");
        }
    }
}
