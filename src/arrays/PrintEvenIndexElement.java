package arrays;

// Print even index element

public class PrintEvenIndexElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
