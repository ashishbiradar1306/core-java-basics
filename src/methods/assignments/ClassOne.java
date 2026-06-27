package methods.assignments;

public class ClassOne {
    public static void main(String[]args){

        int num = 50;
        int a = 10;
        int b = 20;

        ClassOne obj1 = new ClassOne();

        obj1.showMessage(); // 1

        obj1.displayNumber(num); // 2

        int result1 = obj1.getValue(); // 3
        System.out.println("Value Is :"+result1);

        int sum1 = obj1.findSum(a,b); // 4
        System.out.println("The Sum Is :"+sum1);
    }


    // Q1) Create a method showMessage() that prints "Java Learning Started"
    void showMessage(){
        System.out.println("Java Learning Started");
    }

    // Q2) Declare int num = 50 in main() Pass num to displayNumber() method and print it.
    void displayNumber(int num){
        System.out.println("Number Is :"+ num);
    }

    // Q3) Create getValue() method and return 100 Store returned value in a variable and print it.
    int getValue(){
        return 100;
    }

    // Q4) Declare a=10,b=20 in main() Pass them to findSum() method ... Return sum and store it in result variable.
    int findSum(int x,int y){
        int sum = x + y;
        return sum;
    }
}