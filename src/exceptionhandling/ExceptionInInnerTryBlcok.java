package exceptionhandling;

// Exception in inner try block but matching catch block is outer

public class ExceptionInInnerTryBlcok {
    public static void main(String []args){
        try{
            System.out.println("Outer try block"); // 1
            try{
                System.out.println("Inner try block"); // 2
                System.out.println(10/0);
            } catch (Exception e) {
                System.out.println("Inner catch block");
            }
            System.out.println("Outside of inner try catch block");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception is occurred"); // 3
        }
        finally {
            System.out.println("Outer finally block"); // 4
        }
    }
}
