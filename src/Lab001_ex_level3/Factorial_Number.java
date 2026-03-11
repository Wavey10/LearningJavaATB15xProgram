package Lab001_ex_level3;

import java.util.Scanner;

public class Factorial_Number {

    static void main() {

     /*   Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n=scanner.nextInt();
        int M=1;

        if(n<0)
        {
            System.out.println("Factorial not defined");
        }
        else{

            for (int i=1;i<=n;i++)
            {
                M=M*i;

            }
            System.out.println("The Factorial value is:" +M);

        }
        scanner.close();*/


                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();

                // Write your FizzBuzz logic here
                for(int i=1;i<=n;i++)
                {
                    if(i%3==0 && i%5==0)
                    {
                        System.out.println("FizzBuzz");
                    }
                    else if(i%3==0)
                    {
                        System.out.println("Fizz");
                    }else
                    {
                        if(i%5==0)
                        {
                            System.out.println("Buzz");
                        }

                    }
                }






    }
}
