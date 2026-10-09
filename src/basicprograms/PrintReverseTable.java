package basicprograms;

// Write a program to print reverse tables

public class PrintReverseTable {
    public static void main(String[]args){
        int table = 10;
        for (int i = table; i >= 1; i--) {
            System.out.println(table + " * " + i + " = " + (table * i));
        }
    }
}
