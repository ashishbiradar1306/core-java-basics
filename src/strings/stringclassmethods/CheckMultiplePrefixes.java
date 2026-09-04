package strings.stringclassmethods;

// Write a Java program to check whether a String starts with either "Java" or "Python"

public class CheckMultiplePrefixes {
    public static void main(String[] args) {
        String str = "Java Programming";
        if (str.startsWith("Java")) {
            System.out.print("String starts with Java:" + str);
        } else if (str.startsWith("Python")) {
            System.out.print("String starts with Java:" + str);
        } else {
            System.out.println("String starts with other string");
        }
    }
}
