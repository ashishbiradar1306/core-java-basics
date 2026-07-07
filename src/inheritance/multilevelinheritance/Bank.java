package inheritance.multilevelinheritance;


 /* Create a class Bank with the attributes bankName and branchName
    Create a subclass Account that adds the attributes accountNumber and balance
    Then create another subclass FixedDeposit that adds the attributes interestRate and years
    Calculate the interest and maturity amount, and display all the details */

public class Bank {
String bankName = "Bank Of Baroda";
String branchName = "Camp";
}
class Account extends Bank{
    long accountNumber = 123456789123l;
    double balance = 75000.50;
}
class FixedDeposit extends Account{
    float interestRate = 6.5f;
    int years = 2;
    void calculateInterestAndMaturity(){
        double im = (balance * interestRate * years) / 100;
        System.out.println("Interest : " + interestRate);
        System.out.println("Maturity Amount : " + years);
        System.out.println("Interest and Maturity amount :"+im);
    }
    public static void main(String[] args) {
        FixedDeposit obj = new FixedDeposit();
        obj.calculateInterestAndMaturity();
    }
}

