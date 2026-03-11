package OOPS_Lab003.Beginner;

public class ex_14 {
    public static void main() {
        LoginPage l1 = new LoginPage();
        l1.login();
        l1.waitForElement();

    }
}

class BasePage
{
    void waitForElement()
    {
        System.out.println("wait for element");
    }
}

class LoginPage extends BasePage
{
    void login()
    {
        System.out.println("login");
    }
}
