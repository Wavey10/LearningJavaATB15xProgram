package exam_11Jan2026;

import java.util.Scanner;

public class ex_07_calculator {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Below are the arithmetic operations:");
        System.out.println("1)Addition");
        System.out.println("2)Subtraction");
        System.out.println("3)Multiplication");
        System.out.println("4)Division");
        System.out.println("Please enter a number to perform the relevant operation:");
        int number=scan.nextInt();
        System.out.println("Please enter two numbers:");
        int input1=scan.nextInt();
        int input2=scan.nextInt();
        int result;

        switch (number)
        {
            case 1 -> System.out.printf("The result of %d and %d is %d",input1,input2,(input1+input2));
            case 2 -> System.out.printf("The result of %d and %d is %d",input1,input2,(input1-input2));
            case 3 -> System.out.printf("The result of %d and %d is %d",input1,input2,(input1*input2));
            case 4 -> System.out.printf("The result of %d and %d is %d",input1,input2,(input1/input2));
        }
        scan.close();
    }
}
