package labs.lab02classhierperson;

abstract class Employee extends Person{
    Date doa;
    int salary;

    abstract void setSalary(int salary);
    abstract int getSalary();

}
