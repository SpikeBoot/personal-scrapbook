package patterns.creational.FactoryMethod.example;

public class FactoryMethodMain {

    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Transport transport = transportFactory.getTransportForDelivering(99);

        transport.deliver();
    }
}
