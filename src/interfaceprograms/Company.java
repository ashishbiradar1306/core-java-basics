package interfaceprograms;

public class Company {
    interface Department{

        String employeeName1 = "Ashish";
        String employeeName2 = "Akshay";
        String employeeName3 = "Nikhil";

        String departmentName1 = "IT Department";
        String departmentName2 = "HR Department";
        String departmentName3 = "Fianance Department";


        void work();

        class ItDepartment implements Department{
            @Override
            public void work(){
                System.out.println("Employee Name :"+employeeName1);
                System.out.println("Department Name :"+ departmentName1);
                System.out.println("Employee working in IT Department ");
            }
        }

        class HrDepartment implements Department{
        @Override
            public void work(){
            System.out.println("Employee Name :"+employeeName2);
            System.out.println("Department Name :"+departmentName2);
            System.out.println("Employee working in Hr Department ");
        }
        }

        class FinanceDepartment implements Department{
            @Override
            public void work(){
                System.out.println("Employee Name :"+employeeName3);
                System.out.println("Department Name :"+departmentName3);
                System.out.println("Employee working in Finance Department");
            }

        }
    }
}

class MainForObj5{
    public static void main(String[]args){
        Company.Department d1 = new Company.Department.ItDepartment();
        Company.Department d2 = new Company.Department.HrDepartment();
        Company.Department d3 = new Company.Department.FinanceDepartment();
    }
}