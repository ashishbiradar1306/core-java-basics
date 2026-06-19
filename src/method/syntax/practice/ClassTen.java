package method.syntax.practice;

public class ClassTen {
    public static void main(String [] args){
        int marks = 80;
        int basicPay = 15000;
        int bonus = 2500;

        ClassTen obj7 = new ClassTen();

        obj7.square(); // 1

        obj7.printMarks(marks); // 2

        int finalSubs = obj7.subs(); // 3
        System.out.println("Substraction Is :" + finalSubs);

        int salary = obj7.returnSallry(basicPay,bonus); // 4
        System.out.println("Employees Total Salary Is :" + salary);

    }
    // Q1 Print the square of 12
    void square(){
        int num = 12;
        int printSquare = num * num;
        System.out.println("Square of 12 Is :"+printSquare);
    }

    // Q2 Declare marks=80, pass it and print marks + 20
    void printMarks(int marks){
        System.out.println("Total Marks After Adding extra marks"+(marks + 20));
    }

    // Q3 Return the result of 200 - 75, store and print it.
    int subs(){
        int result = 200 - 75;
        return result;
    }

    // Q4 Declare basicPay=15000, bonus=2500, pass them and return total salary
    int returnSallry(int basicPay, int bonus){
        int totalSallry = basicPay + bonus;
        return totalSallry;
    }



}
