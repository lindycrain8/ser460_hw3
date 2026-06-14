package Question2;

class Engine {
    private int fuelLevel;
    private boolean isRunning;

    public Engine() {
        this.fuelLevel = 100;
        this.isRunning = false;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void start() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Engine started");
        } else {
            System.out.println("Not enough fuel to start the engine");
        }
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();
    }

    public void drive() {
        engine.setFuelLevel(engine.getFuelLevel() - 10);
        if (!engine.isRunning()) {
            engine.start();
        }
        if (engine.isRunning()) {
            System.out.println("Car is driving with fuel level: " + engine.getFuelLevel());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.drive();
    }
}