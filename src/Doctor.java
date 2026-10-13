public class Doctor extends Person{
    private String specialization;
    private double consultationFee;

    public Doctor(int personId, String name, int age, String specialization, double consultationFee) {
        super(personId, name, age);

        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public void diagnosePatient() {
        System.out.println("Doctor " + super.getName() + " is diagnosing a patient in " + specialization);
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor " + super.getName() + " is performing their duties");
    }
}
