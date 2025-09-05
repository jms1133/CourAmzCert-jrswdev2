package labs.lab12classhierperson;

abstract class Employee extends Person{
    Date doa;
    int salary;

    abstract void setSalary(int salary);
    abstract int getSalary();

}
