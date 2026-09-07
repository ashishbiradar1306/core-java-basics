package strings;

// Count each character of given string

public class FindFrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "Programming";
        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " = " + frequency[i]);
            }
        }
    }
}

