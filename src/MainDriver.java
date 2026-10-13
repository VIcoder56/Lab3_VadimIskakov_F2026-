public class MainDriver {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(
                101, "John", 35, "Cardiology", 150.0
        );

        Nurse nurse = new Nurse(
                102, "Alice", 28, "Emergency", "Night"
        );

        Surgeon surgeon = new Surgeon(
                103, "Michael", 42, "Cardiology", 250.0,
                "Heart Surgery", 201
        );

        EmergencyDoctor emergencyDoctor = new EmergencyDoctor(
                104, "Sarah", 32, "Emergency Medicine", 180.0
        );

        doctor.performDuties();
        doctor.diagnosePatient();

        nurse.performDuties();
        nurse.assistPatient();

        surgeon.performDuties();
        surgeon.performSurgery();

        emergencyDoctor.performDuties();
        emergencyDoctor.handleEmergency();
        emergencyDoctor.generateBill();
        emergencyDoctor.prescribeMedication();

        System.out.println("\nPolymorphism");
        Person person;
        person = new Doctor(
                105, "Roma", 20, "Cardiology", 200.0
        );
        person.performDuties();
        person = new Nurse(
                105, "Roma", 20, "Cardiology", "Night"
        );
        person.performDuties();
        person = new Surgeon(
                105, "Roma", 42, "Cardiology", 250.0,
                "Heart Surgery", 67
        );
        person.performDuties();
        person = new EmergencyDoctor(
                105, "Roma", 20, "Cardiology", 200.0
        );
        person.performDuties();
    }
}
