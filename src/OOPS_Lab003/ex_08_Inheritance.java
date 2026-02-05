package OOPS_Lab003;

import org.testng.annotations.Test;


public class ex_08_Inheritance {

    public static void main(String[] args) {

        LoginTest l1 = new LoginTest();
        l1.setup();
        l1.executeTest();

    }
}

class baseTest
{
    void setup()
    {
        System.out.println("setup");
    }
}

class LoginTest extends baseTest
{
    void executeTest()
    {
        System.out.println("executeTest");
    }
}
