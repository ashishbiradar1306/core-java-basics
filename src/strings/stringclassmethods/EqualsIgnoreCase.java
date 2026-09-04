package strings.stringclassmethods;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "JAVA";

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
