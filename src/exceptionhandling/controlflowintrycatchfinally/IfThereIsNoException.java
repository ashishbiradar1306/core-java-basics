package exceptionhandling.controlflowintrycatchfinally;

// Q) If there is no exception

public class IfThereIsNoException {
    public static void main(String[]args){
        try{
            System.out.println("Stmt 1");
            System.out.println("Stmt 2");
            System.out.println("Stmt 3");

        } catch (Exception e) {
            System.out.println("Stmt 4");
        }finally {
            System.out.println("Stmt 5");
        }
        System.out.println("Stmt 6");
    }
}

// 1 2 3 5 6