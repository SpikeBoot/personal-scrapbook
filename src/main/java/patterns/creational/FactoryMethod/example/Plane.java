package patterns.creational.FactoryMethod.example;

import patterns.creational.FactoryMethod.example.Transport;

public class Plane implements Transport {

    @Override
    public void deliver() {
        System.out.println("Plane start delivering");
    }
}
