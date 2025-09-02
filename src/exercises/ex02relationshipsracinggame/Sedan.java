package exercises.ex02relationshipsracinggame;

public class Sedan extends  Car{
    int doors;

    Sedan(String regNo, Engine engine) {
        super(regNo, engine);
    }

    @Override
    String getColor() {
        return this.color;
    }

    @Override
    String getModel() {
        return this.model;
    }

    @Override
    public void startEngine() {
        System.out.println("Sedan with " + this.getDetails() +
                " Engine started.");
    }
}

