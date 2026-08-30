package arrays;

public class RepeatedElements {
    public static void main(String[] args) {
        int[] arr = {10, 15, 10, 20, 10, 25, 30};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                count++;
            }
        }
        System.out.print(count);
    }
}
