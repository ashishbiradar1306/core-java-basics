package exceptionhandling;

// Write a program using nested try-catch blocks where the inner block handles one exception and the outer block handles another.
public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                System.out.println("Inner try block");
                System.out.println(10 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero is not allowed");
            }
            System.out.println("Outside of inner try-catch block");
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index");
        }
    }
}