//package polymorphism.methodoverriding;
//
//// Rule 2 :
//// The argument list/method signature should be exactly the same as that of the overriden parent class method
//
//public class RuleTwo {
//    void demo(String print) {
////        System.out.println("Hello");
//    }
//}
//
//class RuleTwoChild extends RuleTwo {
//    @Override
//    void demo(String printNew) {
//        super.demo("Hello");
////        System.out.println("Java");
//    }
//}
//
//class MainForObj2 {
//    public static void main(String[] args) {
//        RuleTwo obj = new RuleTwoChild();
//        obj.demo();
//    }
//}