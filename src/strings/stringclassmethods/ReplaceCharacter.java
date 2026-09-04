package strings.stringclassmethods;

// Write a Java program to replace all occurrences of the character 'a' with 'e' in the given String using the replace() method

public class ReplaceCharacter {
    public static void main(String[]args){
        String str = "Java";
        str = str.replace('a', 'e');
        System.out.println(str);
    }
}
