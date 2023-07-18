package patterns.creational.FactoryMethod.example;

import patterns.creational.FactoryMethod.example.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Ship start delivering");
    }
}
