package Lab001_exercises;

import java.util.Scanner;

public class Greater_of_two_numbers {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two numbers:");
        int x=scanner.nextInt();
       int y= scanner.nextInt();

        if(x>y)
        {
            System.out.println("X is greater");
        }
        else {
            System.out.println("Y is greater");
        }
    }
}
