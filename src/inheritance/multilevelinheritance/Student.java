package inheritance.multilevelinheritance;

/* Create a class Student with the attributes studentName and rollNumber
        Create a subclass Marks that adds the marks of five subjects
        Then create another subclass Result that calculates the total marks and percentage
        Display "Pass" if the percentage is 35% or above; otherwise, display "Fail". Display all the details */


public class Student {
    String studentName = "Aadesh";
    int rollNumber = 1013;
}
class Marks extends Student{
    int java  = 78;
    int python = 82;
    int iot = 74;
    int cyberSecurity = 81;
    int android = 85;
}
class Resullt extends Marks {
    void totalMarks() {
        int total = java + python + iot + cyberSecurity + android;
        System.out.println("Total Marks:"+total);
        float percentage = (total / 500.0f) * 100;
        if (percentage >= 35) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
    }

    public static void main(String[] args) {
        Resullt s1 = new Resullt();
        s1.totalMarks();
    }
}