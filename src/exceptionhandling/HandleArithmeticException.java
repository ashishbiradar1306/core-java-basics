package exceptionhandling;

// Write a program to divide two numbers and handle ArithmeticException when the denominator is 0

public class HandleArithmeticException {
    public static void main(String[]args){
        try{
            int a = 10;
            int b = 0;
            int res = a/b;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
        System.out.println("Flow goes normal here");
    }
}
