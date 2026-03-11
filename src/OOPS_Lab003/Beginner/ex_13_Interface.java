package OOPS_Lab003.Beginner;

public class ex_13_Interface {

    public static void main(String[] args) {
        TestActions t1 =new LoginTests();
        t1.startTest();
        t1.endTest();

    }
}

interface TestActions
{
   void startTest();
   void endTest();
}

class LoginTests implements TestActions
{
    @Override
    public void startTest()
    {
        System.out.println("Test is started");
    }

    @Override
    public void endTest() {
        System.out.println("Test is ended");
    }
}