package methods.assignments;

public class ClassNine {
    public static void main(String [] args){

        int amount = 750;
        int price = 1200;
        int discount = 200;


        ClassNine obj6 = new ClassNine();

        obj6.printCube(); // 1

        obj6.decrease(amount); // 2

        int division1 = obj6.division(); // 3
        System.out.println("Division Is :"+division1);

        int fianlBill = obj6.clothsShop(price,discount); // 6
        System.out.println("Your Final Is :"+fianlBill);

    }
    // Q1 Print the cube of 4.
    void printCube (){
        int cube = 4 * 4 * 4;
        System.out.println("Cube of 4 Is :"+cube);
    }

    // Q2 Declare amount=750, pass it and print amount - 250.
    void decrease(int amount){
        int subs = amount - 250;
        System.out.println("After - 250 Result Is :" + subs);
    }

    // Q3 Return the result of 90 / 3, store and print it.
    int division(){
        int divs = 90 / 3;
        return divs;
    }

    // Q4 Declare price=1200,discount=200, pass them and return final price
    int clothsShop(int price , int discount){
        int finalprice = price - discount;
        return finalprice;

    }

}
