package methods;
// Method Syntax 2
// Syntax 2 : Syntax 2 Has A Parameters And void Return_Type
// static_keyword void_keyword_asAReturnType method_name (parameters/arguments){
// // Actual Business Logic Goes Here
// }

/* For a method with parameters
the variables used as arguments should be declared and initialized in the method from which the call is made*/

public class MethodSyntaxTwo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        String name = "Ashish Biradar";
        int rollNo = 1013;
        double marks = 8.32;
        String dept = "R&D";
        MethodSyntaxTwo.addition(a,b);
        MethodSyntaxTwo.substraction(a, b);
        MethodSyntaxTwo.multiplication(a, b);
        MethodSyntaxTwo.division(a, b);
        MethodSyntaxTwo.modules(a, b);
        MethodSyntaxTwo.displayStudent(name, rollNo);
        MethodSyntaxTwo.showMarks(marks);
        MethodSyntaxTwo.showDepartment(dept);

    }
    // Q1 - Addition
    static void addition(int a1, int a2) {
        int sum = a1 + a2;
        System.out.println("The Addition of a 2 Number Is : " + sum);
    }

    // Q2 - Substraction
    static void substraction(int s1, int s2) {
        int substraction = s1 - s2;
        System.out.println("The Substraction Is :" + substraction);
    }

    // Q3 - Multiplication
    static void multiplication(int m1, int m2) { // 3
        int multiplication = m1 * m2;
        System.out.println("The Multiplication Is :" + multiplication);
    }

    // Q4 - Division
    static void division(int d1, int d2) { // 4
        int div = d1 / d2;
        System.out.println("The Division Is :" + div);
    }

    // Q5 - Modules
    static void modules(int mod1, int mod2) { // 5
        int mod = mod1 % mod2;
        System.out.println("The Modules Is :" + mod);
    }

    // Q6 - Display Student Info
    static void displayStudent(String name, int rollNo) { // 6
        System.out.println("Student Name Is :" + name);
        System.out.println("Student Roll No Is :" + rollNo);
    }

    // Q7 - Display Marks
    static void showMarks(double marks) { // 7
        System.out.println("Semseter 5 Marks :" + marks);
    }

    // Q8 - Display Employeer Details
    static void showDepartment(String dept) { // 8
        System.out.println("The Employeer Department Is :");
    }


}