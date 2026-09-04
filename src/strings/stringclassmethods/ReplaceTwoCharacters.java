package strings.stringclassmethods;

public class ReplaceTwoCharacters {
    public static void main(String[]args){
        String str = "Programming";
        str = str.replace('a', 'A').replace('m', 'M');
        System.out.println(str);
    }
}
