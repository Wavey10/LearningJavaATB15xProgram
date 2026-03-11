package Lab002_exercises;

public class Ternary_Operator {
    static void main() {

        int a=10,b=20,c=30;
      //  int a=20,b=10,c=30;
        //int a=10,b=20,c=30;

        int result_max = (a>b) ? (a>c? a: c):(b>c ? b: c);
        System.out.println(result_max);

    }
}
