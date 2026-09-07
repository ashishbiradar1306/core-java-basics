package strings;

// Write a Java program to demonstrate that two String variables can refer to the same String object

public class StringReferenceBasics {
    public static void main(String[] args){
    String str1 = new String("Ashish");
    String str2 = new String("Ashish");
    System.out.print(str1==str2);
    }
}
