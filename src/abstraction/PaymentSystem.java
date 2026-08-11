package abstraction;

import javax.smartcardio.Card;

public abstract class PaymentSystem {
    long amount;
    PaymentSystem(long amount){
        this.amount = amount;
    }
    abstract void makePayment();

    void showAmount(){
        System.out.println("Payment amount is :" + amount);
    }
}

class UPIPayment extends PaymentSystem{

    UPIPayment(long amount){
        super(amount);
    }
    @Override
    void makePayment() {
        System.out.println("Payment of Rs " + amount + " "+ "made up by using the UPI !");
    }
}

class CardPayment extends UPIPayment{

    CardPayment(long amount){
        super(amount);
    }
    @Override
    void makePayment(){
        System.out.println("Payment of Rs " + amount + " "+ "made up by using the Card Payment !");
    }
}
class MainPayement{
    public static void main(String[]args){
        UPIPayment upi = new UPIPayment(500);
        CardPayment cardpayment = new CardPayment(1000);

        upi.showAmount();
        upi.makePayment();

        cardpayment.showAmount();
        cardpayment.makePayment();


    }
}