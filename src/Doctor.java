
public class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void diagnose() {
        System.out.println("Doctor " + name + " with specialization " + specialization + " is diagnosing...");
    }

    public void treat() {
        System.out.println("Doctor " + name + " with specialization " + specialization + " is treating...");
    }
}

