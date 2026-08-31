package arrays;

// Finding a second largest element
public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 15, 40, 30, 50};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Second largest: " + arr[arr.length - 2]);

    }
}

