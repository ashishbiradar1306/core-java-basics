package polymorphism.methodoverloading;

// We can perform the method overloading also in a different class
public class OverloadingInDiffClass {
    void add(int a , int b){
        int sum = a + b;
        System.out.println("Sum :"+sum);
    }
}
class Two extends OverloadingInDiffClass{
    void add(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("Sum :"+sum);
    }
    public static void main(String [] args){
        Two obj = new Two();
        obj.add(10,10);
        obj.add(10,30,20);
    }
}


