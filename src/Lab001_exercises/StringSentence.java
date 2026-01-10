package Lab001_exercises;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringSentence {


        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            int line_number=1;

            while(scanner.hasNext())
            {
                String sentence=scanner.nextLine();
                System.out.println(line_number + " "+ sentence);
                line_number = line_number+1;
            }

        }
    }
