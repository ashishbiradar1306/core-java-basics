package abstraction;

// Banking Transaction System :

public abstract class Transaction {
    int transactionId;
    double amount;
    Transaction(int transactionId,double amount){
        this.transactionId=transactionId;
        this.amount=amount;
    }
    abstract void process();

    void showTransaction(){
        System.out.println("Transaction Id :"+transactionId);
        System.out.println("Transaction Amount :"+amount);
    }
}

class Deposit extends Transaction{
    Deposit(int transactionId,double amount){
        super(transactionId,amount);
    }
    @Override
    void process(){
        System.out.println("Processing Deposit ");
    }
}
class Withdrawal extends Transaction{
    Withdrawal(int transactionId,double amount){
        super(transactionId,amount);
    }
    @Override
    void process(){
        System.out.println("Processing withdrawal please wait for few minutes !");
    }
}
class Transfer extends Transaction{
    Transfer(int transactionId,double amount){
        super(transactionId,amount);
    }
    void process(){
        System.out.println("Processing Transfer !");
    }
}
class MainForObj08{
    public static void main(String [] args){

        System.out.println("Performing Deposit Operation here :");
        Transaction t1 = new Deposit(1012,5000);
        t1.showTransaction();
        t1.process();
        System.out.println("");

        System.out.println("Performing Withdrawal Operation :");
        Transaction t2 = new Withdrawal(1015,4500);
        t2.showTransaction();
        t2.process();
        System.out.println("");

        System.out.println("Performing Transfer operation :");
        Transaction t3 = new Transfer(1017,7500);
        t3.showTransaction();
        t3.process();

    }
}
