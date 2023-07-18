package patterns.creational.FactoryMethod.example;

public class TransportFactory {

    Transport getTransportForDelivering(double parcelWeight) {
        if (parcelWeight < 100) {
            return new Plane();
        } else {
            return new Ship();
        }
    }
}
