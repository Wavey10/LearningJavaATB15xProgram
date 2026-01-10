package ex_switch_case;

import java.util.Scanner;

public class ex_01_days {

    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 7:");
        int n=scanner.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter a valid number from 1 to 7");
                break;
        }

        System.out.println("End of the program.");
    }
}
