package interfaceprograms;

public interface MedicalService {
    String serviceName = "Medical Service";
    void performService();
}

class Doctor implements MedicalService {

    @Override
    public void performService() {
        System.out.println("Doctor is checking the patient");
    }
}

class Nurse implements MedicalService {

    @Override
    public void performService() {
        System.out.println("Nurse is taking care of the patient");
    }
}

class LabTechnician implements MedicalService {

    @Override
    public void performService() {
        System.out.println("Lab Technician is performing laboratory tests");
    }
}

class Hospital {
    interface EmergencyService {
        void startEmergencyService();
        void stopEmergencyService();
    }

    class EmergencyRoom implements EmergencyService {

        @Override
        public void startEmergencyService() {
            System.out.println("Emergency service now started");
        }

        @Override
        public void stopEmergencyService() {
            System.out.println("Emergency service now stop");
        }
    }
}

class ClsForObj07 {
    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        doctor.performService();

        Nurse nurse = new Nurse();
        nurse.performService();

        LabTechnician labTechnician = new LabTechnician();
        labTechnician.performService();


        Hospital hospital = new Hospital();
        Hospital.EmergencyRoom emergencyRoom = hospital.new EmergencyRoom();
        emergencyRoom.startEmergencyService();
        emergencyRoom.stopEmergencyService();
    }
}