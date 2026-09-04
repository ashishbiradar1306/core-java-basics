package strings.stringclassmethods;

// Write a Java program to split the given String using a comma , as the delimiter and print each element separately

public class SplitByComma {
    public static void main(String[] args) {
        String str = "Java,Python,C++,JavaScript";
        String[] words = str.split(",");
        for (int i=0; i< words.length; i++) {
        System.out.println(words[i]);
        }
    }
}
