package composition;

public class CarGarage {
    public static void main(String[] args) {
        Car car=new Car("Audi",232.420,new Engine(23.5));
        car.ride();
        car.engine.combustion();
    }
}
