package abstraction;

public abstract class BankAccountSystem {
    long accountNumber;
    double balance;
    String name;
    BankAccountSystem(long accountNumber,double balance,String name){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    abstract void calculateInterest();

    void deposit(double amount){
        balance = balance + amount;
    }

    void displayBalance(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Balance :"+balance);
    }
}

class SavingsAccount extends BankAccountSystem{
    SavingsAccount(long accountNumber,double balance,String name){
        super(accountNumber, balance,name);
    }
    @Override
    void calculateInterest() {
        double interest = balance * 4 / 100;
        System.out.println("Interest of your saving account :"+interest);
    }
}

class CurrentAccount extends BankAccountSystem{

    CurrentAccount(long accountNumber,double balance,String name){
        super(accountNumber,balance,name);

    }
    @Override
    void calculateInterest() {
    double interest = balance * 2 / 100;
    System.out.println("Interest of your current account :"+interest);
    }
}

class MainforBas{
    public static void main(String[]args){
    SavingsAccount sava1 = new SavingsAccount(1010101010,50000,"Ashish");
    sava1.deposit(5000.0);
    sava1.displayBalance();
    sava1.calculateInterest();

    CurrentAccount cura1 = new CurrentAccount(1012101500,10000,"Akshay");
    cura1.deposit(5000);
    cura1.displayBalance();
    cura1.calculateInterest();
    }
}