package exam_11Jan2026;

import java.util.Scanner;

public class ex_04_max_of_Two_numbers {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int input1=scan.nextInt();
        int input2=scan.nextInt();

        int result= input1>input2? input1:input2;

        System.out.println("The maximum between two numbers is:"+result);

        scan.close();
    }
}
