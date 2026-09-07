package strings;

// Write a Java program to concatenate two Strings using the + operator and print the resulting String

public class ConcatenateTwoStrings {
    public static void main(String[] args) {

        // By using plus(+) Operator
        String str1 = "Ashish";
        String str2 = "Biradar";
        String result1 = str1 + str2;
        System.out.println("Concatenated string using plus operator: " + result1);

        // By using the concat() method
        String result2 = str1.concat(str2);
        System.out.println("Concatenated string using concat() method: " + result2);
    }
}
