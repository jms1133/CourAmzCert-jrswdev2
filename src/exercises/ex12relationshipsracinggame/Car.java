package exercises.ex12relationshipsracinggame;

abstract class Car extends Vehicle {
    String make, model, color;
    int year;

    Car(String regNo, Engine engine){
        super(regNo, engine);
    }

    abstract String getColor();
    abstract String getModel();
    public void getYear(int year){
        this.year = year;
    }

    public String getDetails(){
        return "Car with " + registrationNo + " model:" + this.model +
                "Year of Mfg: " + this.year;
    }
}
