package arrays;

public class CheckArrayContainsValue {
    public static void main(String[] args) {
        int[] arr6 = {10, 20, 30, 40, 50};
        boolean found = false;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] == 70) {
                found = true;
            }
        }
            if (found) {
                System.out.println("Array contains the element");
            } else {
                System.out.println("Array not contains the element");
            }
        }
    }

