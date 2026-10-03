package exceptionhandling;

public class NestedTryBlock {
    public static void main(String[] args) {

        try {
            System.out.println("Outer try block");

            try {
                System.out.println("Inner try block");
                System.out.println(10 / 0);

            } catch (Exception e) {
                System.out.println("Inner catch block");
            }

            System.out.println("Outside of inner try-catch block");

        } catch (Exception e) {
            System.out.println("Outer catch block");

        } finally {
            System.out.println("Outer finally block");
        }
    }
}
/*
/*
Note:
1) If an exception occurs in the inner try block,
   Java first checks for a matching catch block associated
   with that inner try block.
   If a matching catch is found, it executes that catch.

2) If no matching catch is found for the inner try block,
   the exception propagates to the outer level,
   and Java checks for a matching catch block associated
   with the outer try block.

3) If the outer catch also cannot handle the exception,
   the exception continues propagating to the caller.
*/

