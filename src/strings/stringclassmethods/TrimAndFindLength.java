package strings.stringclassmethods;

// Write a Java program to remove the leading and trailing spaces from the given String using trim(), and then print the length of the trimmed String

public class TrimAndFindLength {
    public static void main(String[]args){
    String str = "   Java Programming   ";
    str = str.trim();
    System.out.println(str);
    System.out.println("String length : "+str.length());
    }
}
