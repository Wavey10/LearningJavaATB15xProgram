package Lab001_exercises;
import java.util.*;
import java.io.*; import java.util.Scanner;

public class MathProblem {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int q = sc.nextInt();   // number of queries

            for (int i = 0; i < q; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int sum = a;
                int power = 1;

                for (int j = 0; j < c; j++) {
                    sum = sum + power * b;
                    System.out.print(sum + " ");
                    power = power * 2;
                }
                System.out.println();
            }

            sc.close();
        }
    }


