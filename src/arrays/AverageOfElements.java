package arrays;
// Q) Average of an array

public class AverageOfElements {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr4 = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr4.length; i++) {
            sum += arr4[i];
        }
        int average = sum / arr4.length;
        System.out.println("Average of an array is :" + average);
    }
}
