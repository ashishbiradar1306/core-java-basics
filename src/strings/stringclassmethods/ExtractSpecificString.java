package strings.stringclassmethods;

// Write a Java program to extract "Programming" from the given String using the substring(beginIndex, endIndex) method
public class ExtractSpecificString {
    public  static void main(String[]args){
        String str = "I Love Java Programming";
        str = str.substring(12,23);
        System.out.print(str);
    }
}
