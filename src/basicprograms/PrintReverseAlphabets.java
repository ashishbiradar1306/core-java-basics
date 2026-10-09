package basicprograms;

// Write a program to print reverse alphabets from Z to A

public class PrintReverseAlphabets {
    public static void main(String[]args){
        for(char i = 'Z'; i>='A'; i--){
            System.out.print(i + " ");
        }
    }
}
