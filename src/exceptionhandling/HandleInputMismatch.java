package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

// Write a program that accepts an integer from the user and handles InputMismatchException if the user enters a non-integer value.

public class HandleInputMismatch {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter a valid input :");
            int num1 = input.nextInt();
            System.out.println(num1);
        }catch (InputMismatchException e) {
            System.out.println("Please enter correct input");
        }
    }
}
