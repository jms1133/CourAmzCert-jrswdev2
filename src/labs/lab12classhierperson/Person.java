package labs.lab12classhierperson;

abstract class Person {
    String name;
    Date dob;

    void getDetails(){
        System.out.println("Name: " + this.name);
    }

    public String getName() {
        return name;
    }
}
