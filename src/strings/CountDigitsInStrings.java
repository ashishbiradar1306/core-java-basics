package strings;

// Count the digits in string

public class CountDigitsInStrings {
    public static void main(String[] args) {
        String str = "Java123Programming45";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        System.out.print("Total digits in strings are :" + count);
    }
}
