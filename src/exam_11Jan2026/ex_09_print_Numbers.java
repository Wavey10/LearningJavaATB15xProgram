package exam_11Jan2026;

import java.util.Scanner;

public class ex_09_print_Numbers {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int i=1;

        do{
            System.out.println(i);
            i++;
        }while(i<=num);

        scan.close();
    }
}
