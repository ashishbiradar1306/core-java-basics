package strings.stringclassmethods;

public class ConcatThreeStrings {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programming";
        String str3 = "Language";

        String newStr = str1.concat(" ").concat(str2).concat(" ").concat(str3);
        System.out.println(newStr);
    }
}
