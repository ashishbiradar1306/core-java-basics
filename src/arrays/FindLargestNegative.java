package arrays;

// Find largest negative number from given array

public class FindLargestNegative {
    public static void main(String[] args) {
        int[] arr = {-10, 5, -2, 8, -15, 3, -1};
        int[] newArr = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.print("Printing negative array: ");
        for (int i = 0; i < j; i++) {
            System.out.print(newArr[i] + " ");
        }

        int largest = newArr[0];
        for (int i = 1; i < j; i++) {
            if (newArr[i] > largest) {
                largest = newArr[i];
            }
        }
        System.out.println();
        System.out.println("Largest negative number: " +largest);
    }
}