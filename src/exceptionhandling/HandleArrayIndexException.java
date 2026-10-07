package exceptionhandling;

import java.util.Scanner;

// Write a program to access an element of an array using a user-provided index. Handle ArrayIndexOutOfBoundsException

public class HandleArrayIndexException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Please enter a array index which you want to access :");
        try {
            int arrIndex = input.nextInt();
            System.out.println("Element at index " + arrIndex + " is: " + arr[arrIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter a correct index");
        }
    }
}
