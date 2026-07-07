package inheritance.singleinheritance;

/*Create a class BankAccount with the attributes accountNumber and balance, and a method deposit()
Create a subclass SavingsAccount that adds the attribute interestRate and a method calculateInterest()
Display the account details and calculated interest */

public class BankAccount {
    long accountNumber = 12345678901234l;
    double balance = 7500.50;
    void deposit(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
    }
}
class SavingsAccount extends BankAccount{
    float interestRate = 6.25f;
    void calculateInterest(){
    double interest = ( balance * interestRate) / 100;
    System.out.println("Interest :"+interest);
    }

    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount();
        acc1.deposit();
        acc1.calculateInterest();
    }
}
