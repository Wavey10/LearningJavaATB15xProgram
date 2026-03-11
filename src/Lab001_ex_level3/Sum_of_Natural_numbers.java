package Lab001_ex_level3;

import java.util.Scanner;

public class Sum_of_Natural_numbers {

    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:\n");
        int n=scanner.nextInt();
        int N=0;

        for(int i=1;i<=n;i++)
        {
            N=N+i;

        }
        System.out.println(N);
        scanner.close();
    }
}
