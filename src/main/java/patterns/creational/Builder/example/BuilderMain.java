package patterns.creational.Builder.example;

public class BuilderMain {
    public static void main(String[] args) {
        Car car = Car.newBuilder()
                .setModel("Audi Q7")
                .setYear(2018)
                .setHorsePower(333)
                .setColor("Black")
                .build();
    }
}
