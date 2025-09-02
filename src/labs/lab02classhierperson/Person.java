package labs.lab02classhierperson;

abstract class Person {
    String name;
    Date dob;

    abstract void getDetails();

    public String getName() {
        return name;
    }
}
