package OOPS_Lab003.Beginner;

public class ex_01 {

    static void main() {

        Car Mahindra =new Car();
        Car Scorpio = new Car();

        Mahindra.displayDetails("Mahindra",100);
        Scorpio.displayDetails("Scorpio", 1000);

    }
}

class Car
{
   // String brand;
    //int speed;

    void displayDetails(String brand, int speed)
    {
        System.out.println("The brand is:" +brand +"and the speed is:"+speed);
    }
}
