package strings.stringclassmethods;

// Write a Java program to find the longest String from the given three Strings using the length() method

public class FindLongestString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programing";
        String str3 = "Developer";

        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            System.out.println("Longest String :" + str1);
            System.out.print("Length :" + str1.length());
        } else if (str2.length() > str1.length() && str2.length() > str3.length()) {
            System.out.println("Longest String :" + str2);
            System.out.print("Length :" + str2.length());
        } else if (str3.length() > str1.length() && str3.length() > str2.length()) {
            System.out.println("Longest String :" + str3);
            System.out.print("Length :" + str3.length());
        }
    }
}