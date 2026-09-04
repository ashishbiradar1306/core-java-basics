package strings.stringclassmethods;

public class ConvertToCharArray {
    public static void main(String[] args) {
        String str = "Java";
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
    }
}
