package OOPS_Lab003.Beginner;

public class ex_04_Constructor {

   public static void main(String[] args) {

       BrowserConfig b1 = new BrowserConfig("Chrome");
       BrowserConfig b2 = new BrowserConfig("Firefox");

       b1.getBrowserName();
       b2.getBrowserName();

    }
}

class BrowserConfig
{
    String browserName;

    public BrowserConfig(String browserName) {
        this.browserName = browserName;
    }

    void getBrowserName()
    {
        System.out.println("The browser am using is:" +this.browserName);
    }
}
