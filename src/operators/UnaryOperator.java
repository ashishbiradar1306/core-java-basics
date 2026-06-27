package operators;

public class UnaryOperator {
    public static void main(String [] args ){
        int num = 100;
        int newNum = 5;

        System.out.println("Variable value Is :"+num);
        // Pre-Increment Operator (++variable)
        // The pre-increment operator increases the value of a variable by 1
        // before the current operation or expression is executed

        // In simple words:
        // 1. First the variable's value is incremented by 1
        // 2. Then the updated value is used in the expression or statement
        System.out.println("Pre Increment Operator Increases The Value by 1 Instantly :"+ ++num);

        // Post Increment Operator
        // The Post-Increment operator increases the value of a variable by 1
        // after the current operation or expression is executed

        // In simple words:
        // 1. First the current operation or expression is executed then variable's value is incremented by 1
        // 2. Then the updated value is used in the next expression or statement
        System.out.println("The post-increment operator increases the value of a variable by after the current operation or expression is executed :" + num++);
        System.out.println("Now the Post Increment operation is happened :"+num);

        System.out.println("variable Value Is :"+newNum);
        // Pre Decrement Operator
        // The pre-decrement operator decreases the value of a variable by 1
        // before the current operation or expression is executed

        // In Simple words :
        // 1 . First the variable's value is decremented by 1
        // 2 . Then the updated value is used in the expression or statement
        System.out.println("Pre Decrement operator Decreses The Value by 1 Instantly :"+ --newNum);

        // Post Decrement Operator
        // Post decrement operator decreases the value of a variable by 1
        // after the current operation or expression is executed
        System.out.println("Post Decrement operator Decreses The Value by 1 after the current operation or expression is executed :"+ newNum--);
        System.out.println("Now The Post Decrement operation is happened :"+ newNum);

    }
}
