package exceptionhandling.controlflowintrycatchfinally;

public class ExceptionInCatchBlock {
    public static void main(String[]args){
        try {
            System.out.println(10/0);
//
        }catch(Exception e){
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally block");
        }
    }
}

