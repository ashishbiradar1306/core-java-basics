package exceptionhandling;

// Write a program containing try, catch, and finally. Demonstrate that the finally block executes whether an exception occurs or not

public class FinallyBlockDemo {
    public static void main(String[]args){

        // Case - 1 : No Exception
        System.out.println("Step - 1");
        try{
            System.out.println("Step - 2");
        } catch (Exception e) {
            System.out.println("Step - 3");
        }finally {
            System.out.println("Step - 4");
        }

        // Case - 2 : Exception occurs
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Division by 0 is not allowed");
        }finally {
            System.out.println("Finally block always executes");
        }
    }
}
