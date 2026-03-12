package OOPS_concepts_challenge;

public class Challenge_12
{
    public static void main(String[] args)
    {
        Display[] play ={new Display(),new Display1()};

        for(Display d: play)
        {
            d.display();
        }

    }

}

class Display
{
    public void display()
    {
        System.out.println("Parent class display method");
    }
}

class Display1 extends Display
{
    @Override
    public void display() {
        System.out.println("Child class display method");
         }
}
