package Lab001_exercises;

import java.util.*;
import java.io.*;

public class PrimitiveDataType {

        public static void main(String []argh)
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();

            for(int i=0;i<t;i++)
            {
                String a =sc.next();

                try
                {

                    long x=Long.parseLong(a);
                   // System.out.println();
                    System.out.println("\n"+ x+" can be fitted in:");
                    if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                    {
                        System.out.println("* byte");
                    }
                    if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                        {
                            System.out.println("* short");
                        }
                        if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                        {
                            System.out.println("* int");
                        }
                        if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                        {
                            System.out.println("* long");
                        }
                }
                catch(Exception e)
                {
                    System.out.println(sc.next()+" can't be fitted anywhere.");
                }
            }
            sc.close();
        }

}
