package exceptionhandling;
import java.util.Scanner;
// Write a program to access a character from a String using a user-provided index Handle StringIndexOutOfBoundsException

public class HandleStringIndexException {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a index which index character you want to access :");
        String name = "Ashish Biradar";
        try{
            int indexNo = input.nextInt();
            System.out.println("Character at index "+ indexNo + " Is :" +name.charAt(indexNo));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Please enter a correct index :");
        }
    }
}
