package methods.syntax;

public class MethodSyntaxFour {
    public static void main(String [] args){
    int a = 10;
    int b = 20;
    int c = 30;
    int num = 5;

    System.out.println("Number Is :"+getNum(a));
    System.out.println("Addition Is :"+addition(a,b));
    System.out.println("Substraction Is :"+substraction(a,b));
    System.out.println("Multiplication Is :"+multiplication(a,b));
    System.out.println("Square Is :"+square(num));
    System.out.println("Sum Of A Three No Is:"+sum(a,b,c));
    Demo.add2(a,b);
    System.out.println("Addition Is :"+c);
    }

    // Q1 - Accept one number as a parameter and return the same number.
    static int getNum(int a){
        return a;
    }

    // Q2 - Accept two numbers as parameters and return their addition.
    static int addition(int a,int b){
        return a+b;
    }

    // Q3 - Accept two numbers as parameters and return their subtraction.
    static int substraction(int a,int b){
        return a-b;
    }

    // Q4 - Accept two numbers as parameters and return their multiplication.
    static int multiplication(int a,int b){
        return a*b;
    }

    // Q5 - Accept two numbers as parameters and return their division.
    static int division(int a,int b){
        return a/b;
    }

    // Q6 - Accept one number as a parameter and return its square.
    static int square(int num){
        return num * num;
    }

    // Q7 - Accept three numbers as parameters and return their total sum.
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}

    // Q8 - Create a method in another class, pass two numbers as parameters, return their addition, store the result in a variable, and print it.

  class Demo{
    static int add2(int a, int b){
        int c = a+b;
        return c;
    }
  }