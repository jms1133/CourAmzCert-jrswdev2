package exercises.ex02relationshipsracinggame;

public abstract class Vehicle {
    String registrationNo;
    Engine engine;

    Vehicle(String regNo, Engine engine){
        this.registrationNo = regNo;
        this.engine = engine;
    }

    public abstract void startEngine();
}
