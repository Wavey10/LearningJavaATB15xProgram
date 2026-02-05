package OOPS_Lab003;

public class ex_03_Constructor {

    public  static void main(String[] args) {

        Employee e1 = new Employee("S123","Shamira",1000000);
        Employee e2 = new Employee("S124","Sona",100000000);
        Employee e3 = new Employee("S125","Kousalya",1000000000);

        System.out.println("The details of Employee is:"+e1.id +" "+ e1.name+" "  + e1.salary);
        System.out.println("The details of Employee is:"+e2.id +" "+ e2.name +" " + e2.salary);
        System.out.println("The details of Employee is:"+e3.id +" "+ e3.name+" "+ e3.salary);
    }
}

class Employee
{
    String id;
    String name;
    int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
