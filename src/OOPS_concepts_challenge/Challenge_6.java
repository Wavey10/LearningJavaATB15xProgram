package OOPS_concepts_challenge;

public class Challenge_6
{
    public static void main(String[] args)
    {
        Vehicle[] vehicle = {new Car(),new Bike()};

        for(Vehicle v:vehicle)
        {
            v.start();
        }
    }
}

class Vehicle
{
    public void start()
    {
        System.out.println("Vehicle starts with durdurdur!");
    }
}

class Car extends Vehicle
{
    public void start()
    {
        System.out.println("Car engine starts with a roar!");
    }
}

class Bike extends Vehicle
{
    public void start()
    {
        System.out.println("Bike engine starts with a purr!");
    }
}