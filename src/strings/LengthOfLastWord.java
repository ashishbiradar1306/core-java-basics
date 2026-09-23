package strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "  Hello World";
        String newStr = str.trim();
        int count = 0;
        for (int i = newStr.length() - 1; i >= 0; i--) {
            if(newStr.charAt(i) !=' '){
                count++;
            }
            else{
                break;
            }
        }
        System.out.print("Length of last characters is :"+count);
    }
}
