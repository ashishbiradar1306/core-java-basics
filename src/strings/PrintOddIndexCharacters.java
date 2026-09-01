package strings;

// Print the characters which is are present in odd index

public class PrintOddIndexCharacters {
    public static void main(String[]args){
        String str = "Ashish";
        for(int i =0; i<str.length(); i++){
            if(i %2 !=0){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
