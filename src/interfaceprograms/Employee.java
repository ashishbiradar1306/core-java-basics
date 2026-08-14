package interfaceprograms;

// Employee Management System

public interface Employee {
    int employeeId1 = 1010;
    String employeeName1 = "Ashish";

    int employeeId2 = 1011;
    String employeeName2 = "Akshay";

    int employeeId3 = 1012;
    String employeeName3 = "Nikhil";

    void calculateSalary();
    void displayEmployeeDetails();
}

class Developer implements Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Basic salary + Coding allowance");
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Employee Name :" + employeeName1);
        System.out.println("Employee ID :" + employeeId1);

    }
}

class Tester implements Employee{
    @Override
    public void calculateSalary(){
    System.out.println("Basic Salary + testing allowance");
    }

    @Override
    public void displayEmployeeDetails(){
    System.out.println("Employee Name :"+employeeName2);
    System.out.println("Empolyee ID :"+employeeId2);
    }
}

class Manager implements Employee{
    @Override
    public void calculateSalary(){
    System.out.println("Basic Salary + management allowance");
    }

    @Override
    public void displayEmployeeDetails(){
    System.out.println("Employee Name :"+employeeName3);
    System.out.println("Employee ID :"+employeeId3);
    }

}

class ClsForObj3{
    public static void main(String [] args){
        Employee emp1 = new Developer();
        Employee emp2 = new Tester();
        Employee emp3 = new Manager();

        emp1.displayEmployeeDetails();
        emp1.calculateSalary();

        emp2.displayEmployeeDetails();
        emp2.calculateSalary();

        emp3.displayEmployeeDetails();
        emp3.calculateSalary();
    }
}