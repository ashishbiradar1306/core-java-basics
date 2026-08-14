package abstraction;

public class Interface {
    public static void main(String[] args) {

    }
}
interface A {
    void drive();
}
class B implements A{
    @Override
    public void drive(){
        System.out.println("Hi Shreyash Dada !");
    }
}