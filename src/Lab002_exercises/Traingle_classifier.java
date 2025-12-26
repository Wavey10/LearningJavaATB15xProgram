package Lab002_exercises;

public class Traingle_classifier {
    static void main(String[] args) {

      /*  int x= Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
       */

        int x=20,y=50,z=20;

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
    }
}
