package exceptionhandling;

// Write a program with multiple catch blocks to handle different exceptions that may occur in the same try block

public class MultipleCatchDemo {
    public static void main(String[]args){
        String name = null;
        try{
            System.out.println(10/0);
            System.out.println(name.length());
        } catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        } catch (NullPointerException e) {
            System.out.println("Cannot access a length of null string reference");
        }
    }
}
