package Lab001_ex_level4;

import java.util.Scanner;

public class StarPatternArray {

    public static void main(String[] args)
    {
        System.out.println("Please enter a number:");
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
