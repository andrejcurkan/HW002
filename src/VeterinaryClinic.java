import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private final List<Goable> goables;
    private final List<Flyable> flyables;
    private final List<Swimable> swimables;
    private final List<Doctor> doctors;
    private final List<Nurse> nurses;

    public VeterinaryClinic() {
        this.goables = new ArrayList<>();
        this.flyables = new ArrayList<>();
        this.swimables = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
    }

    // Методы для работы с животными
    public void addGoable(Goable animal) {
        goables.add(animal);
    }

    public void addFlyable(Flyable animal) {
        flyables.add(animal);
    }

    public void addSwimable(Swimable animal) {
        swimables.add(animal);
    }

    // Методы для работы с персоналом клиники
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    // Методы для получения всех бегающих, плавающих и летающих
    public List<Goable> getAllGoables() {
        return goables;
    }

    public List<Flyable> getAllFlyables() {
        return flyables;
    }

    public List<Swimable> getAllSwimables() {
        return swimables;
    }
}
