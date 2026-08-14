package interfaceprograms;

// Smart Home System :

public interface SmartDevice {
    String DEVICE_CATEGORY1 = "Smart Device";
    String DEVICE_CATEGORY2 = "Normal Device";
    void turnOn();
    void turnOff();
}

class Fan implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Fan Is :"+DEVICE_CATEGORY2);
        System.out.println("Fan Is On now !");
    }

    @Override
    public void turnOff(){
        System.out.println("Fan Is Off now !");
    }
}

class Light implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("Light Is :"+DEVICE_CATEGORY2);
        System.out.println("Light Is On now !");
    }

    @Override
    public void turnOff(){
        System.out.println("Light Is Off now !");
    }
}

class AC implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("AC Is a : "+DEVICE_CATEGORY1);
        System.out.println("AC Is On now !");
    }

    @Override
    public void turnOff(){
        System.out.println("AC Is Off now !");
    }

}

class MainForObj1 {
    public static void main(String[]args){
        SmartDevice f1 = new Fan();
        SmartDevice l1 = new Light();
        SmartDevice a1 = new AC();

        f1.turnOn();
        l1.turnOn();
        a1.turnOn();

        f1.turnOff();
        l1.turnOff();
        a1.turnOff();


    }
}
