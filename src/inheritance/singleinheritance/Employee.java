package inheritance.singleinheritance;

/* Create a class Employee with the attributes name and salary, and a method displayDetails()
Create a subclass Manager that adds the attribute department and a method displayManagerDetails()
Create an object of Manager and display all the details */

public class Employee {
    String name = "Ashish";
    double salary = 100000.50;
    void displayDetails(){
        System.out.println("Empolyee Name :" +name);
        System.out.println("Employee Salary :" +salary);
    }
}

class Manager extends Employee{
        String department = "Business Team";
        void displayManagerDetails(){
            System.out.println("Department :" + department);
        }
    public static void main(String [] args) {
        Manager emp1 = new Manager();
        emp1.displayDetails();
        emp1.displayManagerDetails();
    }
}



