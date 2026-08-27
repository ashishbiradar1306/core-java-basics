package demo;

public class PositiveNegative {
    public static void main(String[] args) {
        int positive;
        int negative;
        int[] arr = {20, -50, 50, 80, 90};
        for (int i = 0; i < arr.length-1; i++) {
            if (i % 2 == 0) {
                positive = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = positive;
            }
        }
        for (int j = 0; j<arr.length;j++) {
        System.out.println(arr[j]);
        }
    }
}
