package exam_11Jan2026;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ex_01_Arithmetic_two_numbers {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int input1=scanner.nextInt();
        int input2=scanner.nextInt();

        System.out.println("Addition:"+ (input1+input2));
        System.out.println("Subtration:"+ (input1-input2));
        System.out.println("Multiplication:"+ (input1*input2));
        System.out.println("Division:"+ (input1/input2));
        System.out.println("Modulo:"+ (input1%input2));

        scanner.close();
    }
}
