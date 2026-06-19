package method.syntax.practice;

public class ClassSeven {
    public static void main(){

        int amount = 500;
        int x = 12;
        int y = 8;

    ClassSeven obj4 = new ClassSeven();

    obj4.addTwoNumber(); // 1

    obj4.printAddition(amount); // 2

    int subs = obj4.substractTwoNumber(); // 3
    System.out.println("Substaction Is :" + subs);

    int finalResult = obj4.sum(x,y); // 4
    System.out.println("Sum Is :"+finalResult);
    }

    // Q1 Print the result of 25 + 75
    void addTwoNumber(){
        int a = 25;
        int b = 75;
        int adds = a + b;
        System.out.println("Addition of 25 + 75 Is :"+adds);
    }

    // Q2 Declare amount=500 , pass it and print amount + 200
    void printAddition(int amount){
        System.out.println("Addition Is :"+ (amount + 200));
    }

    // Q3 Return the result of 80 - 30, store and print it.
    int substractTwoNumber(){
        int sub = 80 - 30;
        return sub;
    }

    // Q4 Declare x=12,y=8, pass them and return their sum.
    int sum(int x , int y){
        int sums = x + y;
       return sums;
    }

}
