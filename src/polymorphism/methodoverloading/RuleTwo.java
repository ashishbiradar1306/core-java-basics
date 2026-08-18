package polymorphism.methodoverloading;

// Rule two of method overloading
// 2) The overloaded method can change the return type of method
// In the below example we completely follow the rule no 2 of the method overloading

public class RuleTwo {

    void add(int a, int b){
        int sum = a+b;
        System.out.println("Sum :"+sum);
    }

    int add(int a, int b, int c){
        int sum1 = a+b+c;
        System.out.println("Sum :"+sum1);
        return sum1;
    }

    public static void main(String[]args){
        RuleTwo obj = new RuleTwo();
        obj.add(75,75);
        obj.add(75,75,80);
    }
}
