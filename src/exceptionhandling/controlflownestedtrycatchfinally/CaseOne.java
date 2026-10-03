package exceptionhandling.controlflownestedtrycatchfinally;

// Case 1 : If there is no exception

public class CaseOne {
    public static void main(String[]args){
        try{
            System.out.println("Stmt 1");
            System.out.println("Stmt 2");
            System.out.println("Stmt 3");
        try{
            System.out.println("Stmt 4");
            System.out.println("Stmt 5");
            System.out.println("Stmt 6");
        }catch (Exception e){
            System.out.println("Stmt 7");
        }finally {
            System.out.println("Stmt 8");
        }
            System.out.println("Stmt 9");
        } catch (Exception e) {
            System.out.println("Stmt 10");
        } finally {
            System.out.println("Stmt 11");
        }
        System.out.println("Stmt 12");
    }
}

// O/p - 1,2,3,4,5,6,8,9,11,12, Normal Termination