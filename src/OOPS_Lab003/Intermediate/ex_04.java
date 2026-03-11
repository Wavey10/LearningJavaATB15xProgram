package OOPS_Lab003.Intermediate;

public class ex_04 {

    public static void main(String[] args) {

        Browser b=new ChromeBrowser();
        b.start();
        b=new FirefoxBrowser();
        b.start();

    }
}

interface Browser
{
    void start();
}

class ChromeBrowser implements Browser
{
    @Override
    public void start() {
        System.out.println("Chrome Browser starts");
    }
}

class FirefoxBrowser implements Browser
{
    public void start()
    {
        System.out.println("Firefox Browser starts");
    }
}