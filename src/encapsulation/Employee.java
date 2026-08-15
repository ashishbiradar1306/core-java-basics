package encapsulation;

// 3) Employee Management System :

public class Employee {
    private int employeeId = 1012;
    private String employeeName;
    private double salary;
    private String department = "Developer";

    public int getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setSalary(int amount){
        if(amount >0 && amount <= 100000){
            this.salary=amount;
        }
        else{
            System.out.println("Invalid Input !");
        }
    }

    public void setEmployeeNameName(String name1){
        if(name1 != null){
            this.employeeName=name1;
        }
        else{
            System.out.println("Please enter a name ");
        }
    }
}

class ClsForObj3{
    public static void main(String[]args){
        Employee emp1 = new Employee();

        emp1.setEmployeeNameName("Ashish");
        emp1.setSalary(90000);

        emp1.getEmployeeId();
        System.out.println("Employee ID :"+emp1.getEmployeeId());

        emp1.getEmployeeName();
        System.out.println("Employee Name :"+emp1.getEmployeeName());

        emp1.getSalary();
        System.out.println("Employee Salary :"+emp1.getSalary());

        emp1.getDepartment();
        System.out.println("Department Name :"+emp1.getDepartment());
    }
}
