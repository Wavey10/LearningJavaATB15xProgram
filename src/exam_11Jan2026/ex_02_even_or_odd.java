package exam_11Jan2026;

import java.util.Scanner;

public class ex_02_even_or_odd {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();

        if(input%2!=0)
        {
            System.out.println("The given number is odd");
        }
        else
        {
            System.out.println("The given number is even");
        }
        scan.close();
    }
}
