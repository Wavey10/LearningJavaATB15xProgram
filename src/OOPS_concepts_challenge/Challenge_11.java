package OOPS_concepts_challenge;

public class Challenge_11
{
    public static void main(String[] args)
    {
        Addition a = new Addition();
        System.out.println("Integer addition:"+a.add(5,3));
        System.out.println("Double addition:"+ a.add(2.5,3.7));
        System.out.println("Three integers addition:"+a.add(1,2,3));

    }

}

class Addition
{
    public int add(int a,int b)
    {
        return a+b;
    }

    public double add(double a,double b)
    {
        return a+b;
    }

    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}