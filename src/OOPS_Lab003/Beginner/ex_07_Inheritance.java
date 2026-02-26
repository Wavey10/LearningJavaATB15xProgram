package OOPS_Lab003.Beginner;

public class ex_07_Inheritance {

    public static void main(String[] args) {

        Bike yamaha = new Bike();
        yamaha.start();
        yamaha.ride();
    }
}

class Vehicle
{
    void start()
    {
        System.out.println("Starting the engine");
    }
}

class Bike extends Vehicle
{
    void ride()
    {
        System.out.println("On the way");
    }
}
