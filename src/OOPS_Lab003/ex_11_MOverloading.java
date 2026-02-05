package OOPS_Lab003;

public class ex_11_MOverloading {

    public static void main(String[] args) {

        Calculator c1= new Calculator();
        System.out.println(c1.add(10,20));
        System.out.println(c1.add(10.243,20.343));
        System.out.println(c1.add(10,20,30));
    }
}

class Calculator
{
    int add(int a,int b)
    {
       return  a+b;
    }

    double add(double a, double b)
    {
        return  a+b;
    }

    int add(int a,int b,int c)
    {
        return  a+b+c;
    }
}
