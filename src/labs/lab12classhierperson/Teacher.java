package labs.lab12classhierperson;

public class Teacher extends Employee{
    String qualifications, subject;

    Teacher(String name, Date dob, Date doa, String qualifications, String subject){
        this.name = name;
        this.dob = dob;
        this.doa = doa;
        this.qualifications = qualifications;
        this.subject = subject;
    }

    @Override
    void getDetails() {
        System.out.println("Name of teacher: " + getName());
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of appointment: " + this.doa.getDate());
        System.out.println("Subject: "+ subject);
        System.out.println("Qualification: " + qualifications);
        System.out.println("Salary: " + getSalary());
    }

    @Override
    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    int getSalary() {
        return this.salary;
    }
}
