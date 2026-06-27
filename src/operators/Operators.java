package operators;

public class Operators {
    public static void main(String [] args){
        int num = 100;
        System.out.println("First We Performs The Post Increment Operation :"+num++); // 100
        System.out.println(num);
        System.out.println("Then 2nd We Performs The Pre Increment Operation :"+ ++num); // 102
        System.out.println("Then In The Last We Want only see the A's current value :"+num); // 102
    }
}