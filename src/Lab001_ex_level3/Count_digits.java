package Lab001_ex_level3;

import java.util.Scanner;

public class Count_digits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int x = scanner.nextInt();

        int count = 0;

        // Special case: 0 has 1 digit
        if (x == 0) {
            count = 1;
        } else {
            // Make number positive if negative
            if (x < 0) {
                x = x * -1;
            }

            // Count digits
            while (x > 0) {
                count++;
                x = x / 10;
            }
        }

        System.out.println("The count of digits is: " + count);
        scanner.close();
    }
}
