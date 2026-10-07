package basicprograms;

import java.util.Scanner;

// 1 Write a program to print all natural numbers from 1 to n
public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter a number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
