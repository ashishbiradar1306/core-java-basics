package strings;

// Count uppercase letters only

public class CountUppercaseLettersInString {
    public static void main(String[] args) {
        String str = "Java PROGRAMMING Language";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        System.out.print("Total number of uppercase letters :"+count);
    }
}
