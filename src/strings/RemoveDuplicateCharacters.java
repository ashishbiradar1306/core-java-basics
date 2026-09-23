    package strings;

    // Remove duplicate characters

    public class RemoveDuplicateCharacters {
        public static void main(String[]args){
            String str = "programming";
            int count=0;
            for(int i=0; i<str.length(); i++){
                for(int j=i+1; i<str.length(); j++){
                    if(str.charAt(i)==str.charAt(j)){
                    count++;
                    }
                }
            }
            System.out.println("Total number of duplicate characters are :"+count);
        }
    }
