package exam_11Jan2026;

import java.util.Scanner;

public class ex_03_type_casting {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double input=scan.nextDouble();
        int b=(int)input;
        System.out.println("Double value is:"+input+" and the explicit conversion of the number in int is: "+b);

        scan.close();
    }
}
