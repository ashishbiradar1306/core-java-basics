package polymorphism.methodoverriding;

public class StaticFinal {
    static void demo1(){
        System.out.println("Inside static method parent class");
    }
    final void demo2(){
        System.out.println("Inside final method parent class");
    }
}

/*

class ChildClass3 extends StaticFinal{
    @Override
    static void demo1(){
        System.out.println("Inside static method child class");
    }

    @Override
    final void demo2(){
        System.out.println("Inside final method child class");
    }
}

*/

// We cannot override the static and final method
// if we used static and final then we will gets the compile time error