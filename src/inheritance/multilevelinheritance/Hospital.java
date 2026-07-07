package inheritance.multilevelinheritance;
/* Create a class Hospital with the attributes hospitalName and location
        Create a subclass Patient that adds the attributes patientName and patientId
        Then create another subclass InPatient that adds the attributes roomCharge and numberOfDays
        Calculate the total hospital bill and display all the details */

public class Hospital {
    String hospitalName = "Nobel";
    String location = "Maggarpatta";
}
class Patient extends Hospital{
    String patientName = "XYZ";
    int patientId = 1500;
}
class InPatient extends Patient{
    float roomCharge = 2000;
    int numberOfDays = 5;
    void calculateBill(){
        float bill = (roomCharge * numberOfDays);
        System.out.println("Hospital Name :" + hospitalName + " & Location Is" + location);
        System.out.println("Patient ID Is :" + patientId);
        System.out.println(patientName + " Your Total Bill Amount Is :" + bill);
    }

    public static void main(String[] args) {
        InPatient p1 = new InPatient();
        p1.calculateBill();
    }
}
