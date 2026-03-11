package OOPS_Lab003.Beginner;

public class ex_02 {

    public static void main(String[] args) {

        Person sha = new Person();
        sha.name="Shamira";
        sha.age=12;

        sha.isAdult();

    }
}

class Person
        {
            String name;
            int age;

        void isAdult()
            {
                if(age>18)
                    System.out.println("Adult");
                else
                    System.out.println("Minor");
            }

                }