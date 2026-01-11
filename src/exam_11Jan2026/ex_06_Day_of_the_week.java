package exam_11Jan2026;

import java.util.Scanner;

public class ex_06_Day_of_the_week {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        switch (number){
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
            case 7 -> System.out.println("Today is Sunday");
        }
        scanner.close();

    }
}
