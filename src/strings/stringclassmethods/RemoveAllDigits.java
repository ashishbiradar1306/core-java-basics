package strings.stringclassmethods;

// Write a Java program to remove all digits from the given String using replaceAll() and a regular expression

public class RemoveAllDigits {
    public static void main(String[]args){
        String str = "Java123Programming456";
        String newStr = str.replaceAll("[0-9]", "");
        System.out.print(newStr);
    }
}
