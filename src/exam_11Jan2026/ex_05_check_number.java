package exam_11Jan2026;

import java.util.Scanner;

public class ex_05_check_number {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();

        String result=input==0? "Zero":input>0?"Positive":"Negative";

        System.out.printf("The given number %d is %s",+input,result);

        scan.close();
    }
}
