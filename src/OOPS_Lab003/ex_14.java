package OOPS_Lab003;

public class ex_14 {
    public static void main() {
        Loginpage l1 = new Loginpage();
        l1.login();

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
