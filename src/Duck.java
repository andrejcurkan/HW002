public class Duck implements Swimable, Flyable {
    @Override
    public double fly() {
        return 30.0; // Скорость полёта утки в км/ч
    }

    @Override
    public double swim() {
        return 15.0; // Скорость плавания утки в км/ч
    }
}