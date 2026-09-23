package strings;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[]args){
        String str = "swiss";
        int count =0;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                count++;
                }
            }
        }
        System.out.println("Total numbers of repeated characters are :"+count);
    }
}
