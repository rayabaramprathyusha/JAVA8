import java.util.*;

interface Vehicle{
    void start();

    default void fueltype()
    {
        System.out.println(" Default Fuel Type : Petrol");
    }
    static void safetyGuidelines(){
        System.out.println(" follow traffic rules and safe belt");
    }
}
class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println(" Car is starting");
    }
    @Override
    public void fueltype() {
        System.out.println(" Car fuel Type : Diesel");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.fueltype();
        Vehicle.safetyGuidelines();
    }
}
