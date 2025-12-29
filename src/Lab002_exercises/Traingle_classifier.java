package Lab002_exercises;

import java.util.Scanner;

public class Traingle_classifier {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x:");
        int x= scanner.nextInt();
        System.out.println("Enter the value for y:");
        int y= scanner.nextInt();
        System.out.println("Enter the value for z:");
        int z= scanner.nextInt();

        if (x == y && y== z && x==z)
        {
            System.out.println("It is an equilateral traingle");

        } else if (x==y || y== z || x==z) {

            System.out.println("It is an isosceles traingle");
        }
        else
        {
            System.out.println("It is an scalene traingle");
        }
        scanner.close();
    }
}
