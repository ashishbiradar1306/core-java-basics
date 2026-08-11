package abstraction;

public abstract class EmployeeSalSystem {
    String name;
    int id;

    EmployeeSalSystem(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();

    void displayEmployee() {
        System.out.println("Employee Name :" + name);
        System.out.println("Employee ID :" + id);
    }
}

class FullTimeEmployee extends EmployeeSalSystem {
    double monthlySalary;

    FullTimeEmployee(String name, int id, long monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Monthly Salary of a employee is :" + monthlySalary);
    }
}

class PartTimeEmployee extends EmployeeSalSystem {
    int hours;
    double ratePerHours;

    PartTimeEmployee(String name, int id, int hours, double ratePerHours) {
        super(name, id);
        this.hours = hours;
        this.ratePerHours = ratePerHours;
    }

    void calculateSalary() {
        double sal = hours * ratePerHours;
        System.out.println("The Salary of a Employee Is :" + sal);
    }
}

class ClsEmpSys{
    public static void main(String[]args){
        FullTimeEmployee empf1 = new FullTimeEmployee("Ashish",1012,30000);
        empf1.displayEmployee();
        empf1.calculateSalary();

        PartTimeEmployee empp1 = new PartTimeEmployee("Akshay",1015,8,2000);
        empp1.displayEmployee();
        empp1.calculateSalary();
    }
}
