package composition;

public class Car {
    String bName;
    double topSpeed;
    Engine engine;
    public Car(String bName, double topSpeed, Engine engine) {
        this.bName = bName;
        this.topSpeed = topSpeed;
        this.engine = engine;
    }
    public void ride(){
        System.out.println(this.bName);
        System.out.println(this.topSpeed);
        System.out.println(this.engine.hp);

    }
}
