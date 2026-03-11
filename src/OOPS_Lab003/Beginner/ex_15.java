package OOPS_Lab003.Beginner;

public class ex_15 {

    public static void main(String[] args) {

        Driver d = new ChromeDriver();
        d.launch();

    }
}

interface Driver
{
    void launch();
}

class ChromeDriver implements Driver
{
    @Override
    public void launch() {
        System.out.println("ChromeDriver browser launched");
    }
}
