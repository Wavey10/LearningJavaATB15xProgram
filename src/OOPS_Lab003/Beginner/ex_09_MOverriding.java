package OOPS_Lab003.Beginner;

public class ex_09_MOverriding {

    public static void main(String[] args) {

        Browser b1=new ChromeBrowser();
        b1.launch();
    }
}

class Browser
{
    void launch()
    {
        System.out.println(" Browser is launching");
    }
}

class ChromeBrowser extends  Browser
{

    void launch()
    {

        System.out.println("Child Browser  is launching");
    }
}

