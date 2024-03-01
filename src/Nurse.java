
public class Nurse {
    private String name;
    private int experienceYears;

    public Nurse(String name) {
        this.name = name;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void assist() {
        System.out.println("Nurse " + name + " with " + experienceYears + " years of experience is assisting...");
    }

    public void administerMedication() {
        System.out.println("Nurse " + name + " with " + experienceYears + " years of experience is administering medication...");
    }
}
