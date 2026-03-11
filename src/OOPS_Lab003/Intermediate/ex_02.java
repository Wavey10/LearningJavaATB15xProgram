package OOPS_Lab003.Intermediate;

public class ex_02 {

    public static void main(String[] args) {

        LoginTest l1=new LoginTest();

    }
}

class BaseTest
{
    BaseTest()
    {
        System.out.println("BaseTest initialized");
    }

}

class LoginTest extends BaseTest
{
    LoginTest()
    {
        System.out.println("LoginTest initialized");
    }
}
