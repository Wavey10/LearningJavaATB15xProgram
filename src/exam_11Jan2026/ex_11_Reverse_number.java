package exam_11Jan2026;

import java.util.Scanner;

public class ex_11_Reverse_number {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number=scan.nextInt();
        int reverse=0;
        int digits;

        do {
            digits=number%10;
            reverse=reverse*10 +digits;
            number=number/10;
        }while (number>0);

        System.out.println("The reversal is:"+reverse);
        scan.close();
    }
}
