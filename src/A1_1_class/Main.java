package A1_1_class;

public class Main {
    public static void main(String[] args) {
        Car Auto = new Car("Bernd");
        Auto.print();
        Auto.drive(1, 10);
        Auto.print();
        Auto.drive(0.5, 100);
        Auto.print();
        Auto.setMileage(20);
    }
}
