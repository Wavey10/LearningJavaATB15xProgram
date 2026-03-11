package Lab001_exercises;

import java.util.Scanner;

public class Hello_World {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0)
        {
            System.out.println("Positive");
        }
        else if (number < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }


    }
}
