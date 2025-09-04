package exercises.ex03interfaceschool;

public class TeachingAssistant extends Student implements EmployeeInterface, StudentInterface{

    TeachingAssistant(String name, String subject){
        super(name, subject);
    }

    @Override
    public double computeSalary() {
        return 25000;
    }

    @Override
    public double computeTax() {
        return 0;
    }
}
