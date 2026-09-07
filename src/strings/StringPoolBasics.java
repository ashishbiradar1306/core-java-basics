package strings;

// Write a Java program to demonstrate that two String literals with the same value refer to the same object in the String Pool

public class StringPoolBasics {
    public static void main(String[]args){
        String str1 = "Ashish";
        String str2 = "Ashish";

        System.out.print(str1==str2);
    }
}
