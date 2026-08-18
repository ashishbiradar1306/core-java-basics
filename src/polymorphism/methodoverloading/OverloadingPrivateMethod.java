package polymorphism.methodoverloading;

public class OverloadingPrivateMethod {
    private void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum :" + sum);
    }
}

class Xyz extends OverloadingPrivateMethod {
    private void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum :" + sum);
    }

    public static void main(String[] args) {

    }
}
