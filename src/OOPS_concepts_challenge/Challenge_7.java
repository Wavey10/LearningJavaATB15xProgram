package OOPS_concepts_challenge;

public class Challenge_7
{
    public static void main(String[] args) {

        Employee manager = new Manager(60000,10000);
        System.out.println("Manager Salary: "+manager.calculateSalary());
        Employee developer = new Developer(50,160);
        System.out.println("Developer Salary: "+developer.calculateSalary());
    }

}

abstract class Employee
{
    public abstract int calculateSalary();
}

class Manager extends Employee
{
    private int base_salary;
    private int bonus;

    public Manager(int base_salary, int bonus) {
        this.base_salary = base_salary;
        this.bonus = bonus;
    }

    public int calculateSalary()
    {
        return base_salary+bonus;

    }
}

class Developer extends Employee
{
    public Developer(int hourly_rate, int hours_worked) {
        this.hourly_rate = hourly_rate;
        this.hours_worked = hours_worked;
    }

    private int hourly_rate;
    private int hours_worked;

    public int calculateSalary()
    {
       return hourly_rate * hours_worked;
    }

}