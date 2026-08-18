package polymorphism.methodoverloading;

public class ValidExamples {

    // 1) Different datatypes of parameters :
    void test(int a, int b) {
        int sum = (a + b);
    }

    void test(int a, float b) {
        float sum = (a + b);
    }

    // 2) Different no of parameters :
    void test(int a , int b , int c){
        int sum = a+b+c;
        System.out.println("Sum :"+sum);
    }

    void test(int a , int b , int c , int d){
        int sum = a+b+c+d;
        System.out.println("Sum :"+sum);
    }

    // Different sequence of data type of parameters

    void test(String name,int age){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }

    void test(int age1,String name1){
        System.out.println("Name :"+name1);
        System.out.println("Age :"+age1);
    }
    public static void main(String[]args){
        ValidExamples obj = new ValidExamples();
        obj.test(75,75);
        obj.test(75,75.0f);

        obj.test(10,10,20);
        obj.test(10,20,30,40);

        obj.test("Ashish",10);
        obj.test(19,"Ashish");
    }
}
