package abstraction;

// Online Shopping System :

public abstract class Delivery {
    int orderId;
    String deliveryAddr;
    Delivery(int orderId,String deliveryAddr){
        this.orderId=orderId;
        this.deliveryAddr=deliveryAddr;
    }
    abstract void deliver();

    void showDeliveryDetails(){
        System.out.println("Order Id :"+orderId);
        System.out.println("Delivery Address :"+deliveryAddr);
    }
}

class StandardDelivery extends Delivery{
    StandardDelivery(int orderId, String deliveryAddr){
        super(orderId,deliveryAddr);
    }
    @Override
    void deliver(){
        System.out.println("Delivery within 5-7 Days !");
    }
}

class ExpressDelivery extends Delivery{
    ExpressDelivery(int orderId , String deliveryAddr){
        super(orderId, deliveryAddr);
    }

    @Override
    void deliver(){
        System.out.println("Delivery withi 1-2 days only !");
    }
}

class MainForObj1{
    public static void main(String[]args){
    Delivery delivery = new StandardDelivery(1012,"Sasane Wasti lane no - 4 , Hadapsar");
    delivery.showDeliveryDetails();
    delivery.deliver();

    Delivery delivery1 = new ExpressDelivery(1015,"Sasane Wasti lane no - 11 , Hadapsar");
    delivery1.showDeliveryDetails();
    delivery1.deliver();
    }
}