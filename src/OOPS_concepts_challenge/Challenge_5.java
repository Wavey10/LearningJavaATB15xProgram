package OOPS_concepts_challenge;

public class Challenge_5
{
    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.makeSound();
        animal =new Cat();
        animal.makeSound();

    }

}

class Animal
{
    public void makeSound()
    {
        System.out.println("rrrrrrrrrrrrrr");
    }

}

class Dog extends Animal
{
    public void makeSound()
    {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Cat extends Animal
{
    public void makeSound()
    {
        System.out.println("Cat says: Meow! Meow!");
    }

}
