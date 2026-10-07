package exceptionhandling;

// Write a program where you deliberately access a method on a null String reference and handle NullPointerException

public class DemoNullPointerException {
    public static void main(String[] args) {
    String str = null;
    try{
        System.out.println(str.length());
    } catch (NullPointerException e) {
        System.out.println("Cannot access the length of a null String reference");
    }
    }
}
