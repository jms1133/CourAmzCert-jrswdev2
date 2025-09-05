package exercises.ex13interfaceschool;

public class Employee extends Person implements EmployeeInterface {
    int basicPay;

    Employee(String name, int basic){
        this.name = name;
        this.basicPay = basic;
    }

    @Override
    public double computeSalary() {
        double salary;
        salary = this.basicPay + this.basicPay *.5;
        return salary;
    }

    @Override
    public double computeTax() {
        return 0;
    }
}
