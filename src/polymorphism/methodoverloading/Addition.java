package polymorphism.methodoverloading;

public class Addition {
    void addition(int a,int b){
        int sum = (a + b);
        System.out.println("Addition of two no is :"+sum);
    }

    void addition(int a,int b,int c){
        int sum = (a+b+c);
        System.out.println("Addition of three no is :"+sum);
    }

    void addition(int a,int b,int c,int d){
        int sum = (a+b+c+d);
        System.out.println("Addition of four no is :"+sum);
    }

    Addition(){
        System.out.println("No arg constructor is called ");
    }

    public static void main(String[]args){
        Addition obj = new Addition();
        obj.addition(75,75);
    }
}
