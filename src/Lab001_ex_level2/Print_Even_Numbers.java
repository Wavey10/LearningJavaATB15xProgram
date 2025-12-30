package Lab001_ex_level2;

import java.util.Scanner;

public class Print_Even_Numbers {

    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n=scanner.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i%2==0){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
