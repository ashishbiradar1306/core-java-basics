package encapsulation;

// 2) Bank Account System :

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public long getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }
}

class clsForObj2{
    public static void main(String[]args){
        BankAccount acc1 = new BankAccount();

        acc1.setAccountHolderName("Ashish Biradar");
        System.out.println(acc1.getAccountHolderName());

        acc1.deposit(500);
        System.out.println(acc1.getBalance());

        acc1.withdraw(500);
        System.out.println(acc1.getBalance());
    }
}