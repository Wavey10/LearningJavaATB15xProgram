package OOPS_concepts_challenge;



public class Challenge_1 {

    public static void main(String[] args) {

        Person p1 = new Person("John",25);
        p1.display();
        Person p2 = new Person("Alice",30);
        p2.display();
    }
}

class Person
{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.printf(" Name: "+ this.name + ", Age: "+this.age);
    }
}
