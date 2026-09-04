package strings.stringclassmethods;

// Write a Java program to check whether the given String starts with "Java" using startsWith()

public class CheckStringStartsWith {
    public static void main(String[] args) {
        String str = "Java Programming";
        if (str.startsWith("Java")) {
            System.out.println("Starts with Java: true");
        } else {
            System.out.println("Starts with Java: false");
        }
    }
}
