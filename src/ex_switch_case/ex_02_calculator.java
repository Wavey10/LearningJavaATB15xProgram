package ex_switch_case;

import java.util.Scanner;

public class ex_02_calculator {

    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("Please enter the operation from 1 to 4:");
        int c=scanner.nextInt();

        switch(c)
        {
            case 1:
                System.out.println("Addition:"+ (a+b));
                break;
            case 2:
                System.out.println("Subtraction:"+ (a-b));
                break;
            case 3:
                System.out.println("Multiplication:"+ (a*b));
                break;
            case 4:
                if(b==0)
                {
                    System.out.println("Cannot divide by 0");
                }
                else
                {
                    System.out.println("Division:"+ ((double)a/b));
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("End of the program");
        scanner.close();
    }
}
