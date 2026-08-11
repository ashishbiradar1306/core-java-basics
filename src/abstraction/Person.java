package abstraction;

// Hospital Management System :

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name of the person :" + name);
        System.out.println("Age of the person :" + age);
    }
}

abstract class HospitalStaff extends Person {
    int empId;

    HospitalStaff(String name, int age, int empId) {
        super(name, age);
        this.empId = empId;
    }

    abstract void performDuty();

    void displayStaff() {
        System.out.println("Employee ID :" + empId);
    }
}

class Doctor extends HospitalStaff {
    Doctor(String name, int age, int empId) {
        super(name, age, empId);
    }

    void performDuty() {
        System.out.println("Doctor diagnoses patients");
    }
}

class Nurse extends HospitalStaff {
    Nurse(String name, int age, int empId) {
        super(name, age, empId);
    }

    @Override
    void performDuty() {
        System.out.println("Nurse takes care of patients");
    }
}

class ClsForHObj {
    public static void main(String[] args) {
        HospitalStaff d1 = new Doctor("Momin", 40, 1012);
        HospitalStaff n1 = new Nurse("John", 30, 1015);

        System.out.println("Doctor Details :");
        d1.displayPerson();
        d1.displayStaff();
        d1.performDuty();

        System.out.println("Nurse Details :");
        n1.displayPerson();
        n1.displayStaff();
        n1.performDuty();
    }
}