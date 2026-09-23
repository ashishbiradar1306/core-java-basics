package strings;

//  Count the spaces in string

public class CountSpacesInString {
    public static void main(String[] args) {
        String str = "Java is a programming language";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        System.out.print("Number of spaces present in strings are :" + count);
    }

}

