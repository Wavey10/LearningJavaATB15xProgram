package Lab001_ex_level2;

import java.util.Scanner;

public class PrintNumbers {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n= scanner.nextInt();

        for (int i= 1;i<=n;i++)
        {
            System.out.println(i);
        }

    }
}
