package strings.stringclassmethods;

public class SplitStringsToWords {
    public static void main(String[] args) {
        String str = "Java is easy";
        String[] words = str.split(" ");
        for(int i =0; i<words.length; i++){
            System.out.println(words[i]);
        }
    }
}
