package OOPS_concepts_challenge;

public class Challenge_3 {

    public static void main(String[] args)
    {
        Employee e1=new Employee(1,"John Doe",50000);

        System.out.println(e1);

    }

}

class Employee
{
    private int id;
    private String name;
    private int salary;

    public Employee(int id,String name, int salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString()
    {
        return "Employee ID: " + id +
                " Employee Name: " + name +
                " Employee Salary: "+salary;
    }
}
