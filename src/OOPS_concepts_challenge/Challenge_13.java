package OOPS_concepts_challenge;

public class Challenge_13
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.display_outer();

        Outer.Inner i =o.new Inner();
        i.display_inner();
    }
}

class Outer
{
    private int x=10;

    public void display_outer()
    {
        System.out.println("Outer class variable x:"+x);
    }

    class Inner
    {
        public void display_inner()
        {
            System.out.println("Inner class accessing outer variable x:"+x);
        }
    }
}

