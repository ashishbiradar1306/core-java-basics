package basicprograms;

import java.util.Scanner;

public class NaturalNumbersInReverse {
    public static void main(String[] args) {
        System.out.println("Please enter a number :");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        for (int i = num; i < 1; i--) {
            System.out.println(i);
        }
    }
}
