package strings;

// Check string is palindrome or not >

public class CheckStringPalindrome {
    public static void main(String []args){
        String str = "Madam";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
            if(str.equalsIgnoreCase(reverse)){
                System.out.println("Given string is palindrome");
            }else{
                System.out.print("String is not palindrome");
            }
        }

    }
