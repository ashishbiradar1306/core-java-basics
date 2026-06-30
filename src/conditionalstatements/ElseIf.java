package conditionalstatements;

public class ElseIf {
    public static void main(String [] arg){
        int marks= 95;

        if(marks < 35){
            System.out.println("Fail");
        }else if(marks >= 35 && marks <60){
            System.out.println("Passed with Second Class");
        }else if(marks >= 60 && marks <75){
            System.out.println("Passed With First Class");
        }else if(marks >= 75 && marks <90){
            System.out.println("Pass First Class With Distinction");
        } else if (marks <= 90 && marks <= 100) {
            System.out.println("Merit");
        }else {
            System.out.println("Please Enter Correct Marks");
        }
    }
}
