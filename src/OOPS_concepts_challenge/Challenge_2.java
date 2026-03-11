package OOPS_concepts_challenge;

public class Challenge_2 {

    public static void main(String[] args)
    {

        Student s1=new Student("Bob",101,"A");
        s1.print_Student_Details();
    }

}

class Student
{
    String name;
    int rollNo;
    String section;

    public Student(String name,int rollNo,String section)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.section=section;
    }

    public void print_Student_Details()
    {
        System.out.println("Student: "+this.name+", Roll No: "+this.rollNo+", Section: "+this.section);
    }
}