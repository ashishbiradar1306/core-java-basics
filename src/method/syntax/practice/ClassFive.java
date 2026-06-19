package method.syntax.practice;

public class ClassFive {
    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int num = 15;
    int m1 = 10;
    int m2 = 5;

        ClassFive obj2 = new ClassFive();

        obj2.addition(); // 1

        obj2.multiplication(num); // 2

        int subs = obj2.substraction(); // 3
        System.out.println("Substraction Is :"+subs);

        int multiply = obj2.multiplicationTwo(m1,m2); // 4
        System.out.println("Multiplication Is :"+multiply);

    }
    // Q1 Print the result of 10 + 20.
    void addition(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition of 10 + 20 Is :"+c);
    }

    // Q2 Declare num=15, pass it and print num * 2.
    void multiplication(int num){
    int mul = num * 2;
    System.out.println("Multiplication Is :"+mul);
    }

    // Q3 Return the result of 50 - 20, store and print it.
    int substraction(){
        int s1 = 50;
        int s2 = 20;
        int sub = s1 - s2;
        return sub;
    }

    // Q4 Declare m1=10,m2=5, pass them and return their multiplication.
    int multiplicationTwo(int m1,int m2){
        int mulTwo = m1 * m2;
        return mulTwo;
    }








}