package exceptionhandling;

public class ExceptionInCatchBlock {
    public static void main(String[]args){
        try{
            System.out.println("Stmt -1");
            System.out.println("Stmt -2");
            System.out.println("Stmt -3");
        }catch(Exception e){
            System.out.println(10/0);
        }
    }
}

/*
If an exception occurs in the try block, the catch block is executed. If no exception occurs in the try block, the catch
block is not executed, even if the catch block contains code that can cause an exception.
*/