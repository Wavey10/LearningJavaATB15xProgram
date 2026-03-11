package Lab001_ex_level4;

import java.util.Scanner;

public class Reverse_String {

    static void main() {

        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String reverse=" ";

        for(int i=input.length()-1;i>=0;i--)
        {
            reverse=reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }
}
