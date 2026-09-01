package strings;

// Print the even index characters from an given string

public class PrintEvenIndexCharacters {
    public static void main(String[]args){
        String str = "Ashish";
        for(int i=0; i<str.length();i++){
            if(i %2 ==0){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
