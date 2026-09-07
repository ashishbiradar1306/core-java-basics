package strings;

// Count the Number of characters in a String

public class CountCharactersInString {
    public static void main(String[] args) {
        String str = "programming";
        int count = 0;

        for(int i=0; i<str.length(); i++){
            count++;
        }
        System.out.print("The total number of characters are present in String are :"+count);
    }
}
