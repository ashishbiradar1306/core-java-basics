package arrays;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr9 = {80, 50, 60, 42, 97, 70};
        int largest = arr9[0];
        for (int i = 0; i < arr9.length; i++) {
            if (arr9[i] > largest) {
                largest = arr9[i];
            }
        }
        System.out.println("The largest element of an array :" + largest);
    }
}
