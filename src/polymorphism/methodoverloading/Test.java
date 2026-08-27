package polymorphism.methodoverloading;

public class Test {

    public void display() {
        System.out.println("Hello");
    }

    static public void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}