package strings;

public class ReverseString1 {
    public static void main(String[] args) {
        String str = "Ashish";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("String in reverse order :" + reverse);
    }
}
