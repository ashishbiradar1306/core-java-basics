package strings.stringclassmethods;

public class CompareIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "JAVA";

        if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}

