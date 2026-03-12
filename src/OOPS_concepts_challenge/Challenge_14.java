package OOPS_concepts_challenge;

public class Challenge_14
{
    public static void main(String[] args)
    {
        try
        {
            String num = "abc";
            int a = Integer.parseInt(num);   // NumberFormatException
        }catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException: Invalid number format");
        }

        try
        {
            int[] arr = {10,20,30};  // ArrayIndexOutOfBoundsException
            int value = arr[5];
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }

        try
        {
            int result = 5/0;  // Arithmetic Exception
        }catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }

        finally
        {
            System.out.println("Program finished");
        }
    }
}