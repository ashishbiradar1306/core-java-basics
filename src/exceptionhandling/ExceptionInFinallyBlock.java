package exceptionhandling;

public class ExceptionInFinallyBlock {
    public static void main(String[]args){
        try{
            System.out.println("Stmt - 1");
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Arithmetic exception occurred");
        }finally {
            System.out.println(10/0);
        }
    }
}

/* Note -
If the try block does not throw an exception, the catch block is skipped
and the finally block executes.
If an exception occurs inside the finally block, that exception is treated
as a new exception. The previous catch block does not handle it.
If the exception from finally is not handled by any surrounding
try-catch, it propagates out of the method and is reported as
an uncaught exception by the default uncaught-exception handling.
 */