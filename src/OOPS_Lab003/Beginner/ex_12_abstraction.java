package OOPS_Lab003.Beginner;

public class ex_12_abstraction {

    public static void main(String[] args) {
        Chrome c1= new Chrome();
        c1.open();
    }
}

interface browser
{
    void open();
}

class Chrome implements browser
{
    @Override
    public void open() {
        System.out.println("Launched Chrome browser");
    }
}

class Firefox implements browser
{
    @Override
    public void open() {
        System.out.println("Launched Firefox browser");
    }
}