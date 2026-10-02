package exceptionhandling;

public class SystemExit0 {
    public static void main(String[]args){
        try{
            System.out.println("Try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Catch");
        }finally {
            System.out.println("Finally");
        }
    }
}

/*
Whenever wr are using Systrm.ext(0) JVM itself going to be shut down in this particular finally block not executed
*/