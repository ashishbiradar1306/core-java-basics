package abstraction;

// Payment Getway System
public abstract class PaymentGateway {
String merchantName;
float amount;
    PaymentGateway(String merchantName , float amount){
        this.merchantName=merchantName;
        this.amount=amount;
    }
    abstract void pay();

    void generateReceipt(){
    System.out.println("Merchant Name :"+merchantName);
    System.out.println("Amonut :"+amount);
    }
}

class GooglePay extends PaymentGateway{
    GooglePay(String merchantName,float amount){
        super(merchantName,amount);
    }
    @Override
    void pay(){
        System.out.println("Payment made using Google Pay !");
    }
}

class PhonePay extends PaymentGateway{
    PhonePay(String merchantName,float amount){
        super(merchantName,amount);
    }
    @Override
    void pay(){
        System.out.println("Payment made up by using the Phone Pay");
    }
}

class CreditCard extends PaymentGateway{
    CreditCard(String merchantName,float amount){
        super(merchantName,amount);
    }

    @Override
    void pay(){
        System.out.println("Payment made up by using the Credit Card  ");
    }
}

class ClsMainForObj {
    public static void main(String[] args) {

        PaymentGateway pay1 = new GooglePay("eWay",50000);
        System.out.println("Google Pay :");
        pay1.generateReceipt();
        pay1.pay();

        System.out.println("Phone Pay :");
        PaymentGateway pay2 = new PhonePay("AnyBank",4500);
        pay2.generateReceipt();
        pay2.pay();

        System.out.println("Credit Card :");
        PaymentGateway pay3 = new CreditCard("Fino Bank",75000);
        pay3.generateReceipt();
        pay3.pay();
    }
}