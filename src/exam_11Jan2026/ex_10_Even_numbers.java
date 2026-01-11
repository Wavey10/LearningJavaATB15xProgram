package exam_11Jan2026;

import java.util.Scanner;

public class ex_10_Even_numbers {

    public static void main(String[] args) {

        int number=50;
        int i=1;

        do{
            if(i%2==0)
                System.out.println(i);
            i++;
        }while (i<=50);

    }
}
