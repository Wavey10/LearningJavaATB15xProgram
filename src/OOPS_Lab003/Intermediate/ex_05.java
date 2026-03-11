package OOPS_Lab003.Intermediate;

public class ex_05 {

    public static void main(String[] args) {

        LoginPage l1=new LoginPage();
      //  l1.waitForElement();
        l1.login();

    }
}

class BasePage
{
    protected void waitForElement()
    {
        System.out.println("Waiting for locators");
    }
}

class LoginPage extends BasePage
{
    void login()
    {
        super.waitForElement();
        System.out.println("Logged in");
    }
}