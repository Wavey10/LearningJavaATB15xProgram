package OOPS_concepts_challenge;

public class Challenge_9
{
    public static void main(String[] args)
    {
        Drawable[] drawables = {new Rectanglee(),new Circlee()};

        for(Drawable drawable : drawables)
        {
            drawable.draw();
        }

    }

}

interface Drawable
{
    void draw();
}

class Rectanglee implements Drawable
{

    @Override
    public void draw()
    {
        System.out.println("Drawing a Rectangle");
    }
}

class Circlee implements Drawable
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}