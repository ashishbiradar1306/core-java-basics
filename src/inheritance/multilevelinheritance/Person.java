package inheritance.multilevelinheritance;

/* Create a class Person with the attributes name and age Create a subclass Employee that adds the attribute basicSalary
        Then create another subclass Manager that adds the attribute bonus
        Calculate the gross salary by adding the basic salary and bonus, and display all the details */

public class Person {
    String name = "Suhas";
    int age = 20;
}
class Employee extends Person{
    float basicSalary = 20000.00f;
}
class Manager extends Employee{
    int bonus = 4500;
    void grossSalary(){
        System.out.println("Name Of Employee : " + name);
        System.out.println("Age Of The Emplpoyee : " + age);
        System.out.println("Basic Salary Of The Employee : " + basicSalary );
        System.out.println("Bonus Employee Got : " + bonus);
        float totalSallary = (basicSalary + bonus);
        System.out.println("Total Gross Salary Is :"+totalSallary);
    }

    public static void main(String[] args) {
        Manager emp1 = new Manager();
        emp1.grossSalary();
    }
}