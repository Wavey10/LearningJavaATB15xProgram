package Lab001_ex_level2;

import java.util.Scanner;

public class Print_Numbers_from_n_to_1 {

    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kindly enter a number:");
        int N=scanner.nextInt();

        for (int i=N;i>0; i--)
        {
            System.out.println(i);

        }

    }
}
