package Lab001_exercises;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Multiplication {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();

            for(int i=1;i<=10;i++)
            {

                int r=N*i;
                System.out.println(N+" * "+i+" = "+r);
            }
        }
    }

