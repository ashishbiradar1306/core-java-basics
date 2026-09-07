package strings;

// Write a Java program to convert a String into a char[] using the toCharArray() method and print every character of the resulting array using a loop

public class ConvertStringToCharacterArray {
    public static void main(String[] args) {
        String str = "Java Programming";
        char [] characters = str.toCharArray();
        for(int i =0; i< characters.length; i++){
            System.out.print(characters[i]+" ");
        }
    }
}
