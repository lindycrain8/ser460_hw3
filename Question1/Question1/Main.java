package Question1;

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Transmission {
    public void shift() {
        System.out.println("Transmission shifted");
    }
}

class Wheels {
    public void roll() {
        System.out.println("Wheels rolling");
    }
}

class CarFactory {
    public static Car createCar() {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();
        Wheels wheels = new Wheels();
        return new Car(engine, transmission, wheels);
    }
}

class Car {
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;

    public Car(Engine engine, Transmission transmission, Wheels wheels) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
    }

    public void drive() {
        engine.start();
        transmission.shift();
        wheels.roll();
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.createCar();
        car.drive();
    }
}