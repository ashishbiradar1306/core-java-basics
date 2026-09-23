package strings;

// Remove spaces from a string
public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "Java is a powerful language";
        String newStr = str.replace(" ", "");
        System.out.println(newStr);
    }
}
