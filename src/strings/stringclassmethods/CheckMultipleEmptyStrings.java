package strings.stringclassmethods;

// Write a Java program that checks two Strings and prints whether each String is empty or not.

public class CheckMultipleEmptyStrings {
    public static void main(String[]args){
        String str1 = "";
        String str2 = "Ashish";

        if(str1.isEmpty()){
            System.out.println("str1 is empty");
        }else{
            System.out.println("str1 is not empty");
        }


        if(str2.isEmpty()){
            System.out.println("str2 is empty");
        }else{
            System.out.println("str2 is not empty");
        }
    }
}
