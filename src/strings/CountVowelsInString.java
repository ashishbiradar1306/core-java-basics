package strings;

// Count the total number of vowels (a, e, i, o, u) present in the String

public class CountVowelsInString {
    public static void main(String[] args) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String str = "Java Programming";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (currentChar == vowels[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total vowels in the String: " + count);
    }
}