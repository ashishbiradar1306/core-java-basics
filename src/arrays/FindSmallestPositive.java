package arrays;

// Find smallest positive number from an given array

public class FindSmallestPositive {
    public static void main(String[] args) {
        int[] arr = {-10, 5, -2, 8, 3, -1};
        int[] newArr = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.print("Array with positive elements only :");
        for (int i = 0; i < j; i++) {
            System.out.print(newArr[i] + " ");
        }

        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                if (newArr[i] > newArr[k]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[k];
                    newArr[k] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Smallest positive number is :" + newArr[0]);
    }
}
