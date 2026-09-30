package exceptionhandling;

public class ControlFlowInsideTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Stmt - 1");
            System.out.println(10 / 0); // Stmt - 2
            System.out.println("Stmt - 3");
        } catch (Exception e) {
            System.out.println(10 / 2);
        }
    }
}

/*

O/P:
Stmt - 1
5

Explanation:
Stmt - 1 is executed successfully

In Stmt - 2, an ArithmeticException occurs because we are trying to
divide 10 by 0

When an exception occurs inside the try block, the remaining statements
inside the try block are skipped, and control immediately transfers to
the matching catch block

Therefore, the code inside the catch block is executed and 10 / 2
prints 5

Stmt - 3 will NOT be executed because once control is transferred from
the try block to the catch block, it does not return back to the try block.
7*/


