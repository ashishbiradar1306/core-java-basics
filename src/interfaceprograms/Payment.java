package interfaceprograms;

// Device Management System

public interface Payment {
    public static final String BANK_NAME = "BOB";
    void pay();
    void generateReceipt();
}

class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Make payment through UPI");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Bank Name :" + BANK_NAME);
        System.out.println("UPI Payment Receipt");
    }
}

class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Make payment through Card");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Bank Name :"+BANK_NAME);
        System.out.println("Card Payment Receipt");
    }
}

class CashPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Make payment through Cash");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Bank Name :"+BANK_NAME);
        System.out.println("Cash Payment Receipt");
    }
}

class MainForObj2 {
    public static void main(String[] args) {
        Payment upiPayment1 = new UpiPayment();
        Payment cardpayment1 = new CardPayment();
        Payment cashPayment1 = new CashPayment();

        upiPayment1.pay();
        upiPayment1.generateReceipt();

        cardpayment1.pay();
        cardpayment1.generateReceipt();

        cashPayment1.pay();
        cashPayment1.generateReceipt();
    }
}