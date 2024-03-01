import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Пример использования
        VeterinaryClinic clinic = new VeterinaryClinic();

        clinic.addGoable(new Dog());
        clinic.addGoable(new Horse());
        clinic.addFlyable(new Eagle());
        clinic.addFlyable(new Parrot());
        clinic.addSwimable(new Fish());
        clinic.addSwimable(new Duck());

        Doctor john = new Doctor("John");
        Doctor alice = new Doctor("Alice");
        Nurse kate = new Nurse("Kate");

        clinic.addDoctor(john);
        clinic.addDoctor(alice);
        clinic.addNurse(kate);

        // Устанавливаем специализацию для докторов и опыт для медсестры
        john.setSpecialization("Veterinarian");
        alice.setSpecialization("Surgeon");
        kate.setExperienceYears(5);

        // Вызов методов для докторов
        john.diagnose();
        john.treat();
        alice.diagnose();
        alice.treat();

        // Вызов методов для медсестры
        kate.assist();
        kate.administerMedication();

        // Получение всех бегающих
        System.out.println("\nAll Goables:");
        List<Goable> goables = clinic.getAllGoables();
        for (Goable goable : goables) {
            System.out.println(goable.getClass().getSimpleName() + ": " + goable.run() + " km/h");
        }

        // Получение всех летающих
        System.out.println("\nAll Flyables:");
        List<Flyable> flyables = clinic.getAllFlyables();
        for (Flyable flyable : flyables) {
            System.out.println(flyable.getClass().getSimpleName() + ": " + flyable.fly() + " km/h");
        }

        // Получение всех плавающих
        System.out.println("\nAll Swimables:");
        List<Swimable> swimables = clinic.getAllSwimables();
        for (Swimable swimable : swimables) {
            System.out.println(swimable.getClass().getSimpleName() + ": " + swimable.swim() + " km/h");
        }
    }
}
