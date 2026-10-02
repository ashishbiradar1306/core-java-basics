package exceptionhandling;

// Try Catch Finally Priority
public class TryCatchFinallyPriority {

    public static int test() {
        try {
            return 999;
        } catch (Exception e) {
            return 888;
        } finally {
            return 777;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}