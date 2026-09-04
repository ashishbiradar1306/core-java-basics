package strings.stringclassmethods;

// Write a Java program to print all characters present at even indexes of the given String using charAt()

public class PrintEvenIndexCharacters {
    public static void main(String[]args){
    String str = "Ashish";
    for(int i = 0; i<str.length(); i++){
        if(i % 2 ==0){
        System.out.print(str.charAt(i) +" ");
        }
    }
    }
}
