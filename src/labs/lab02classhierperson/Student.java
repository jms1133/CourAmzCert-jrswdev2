package labs.lab02classhierperson;

public class Student extends Person{
    String subject;
    Teacher teacher;

    Student(String name, Date dob, Teacher teacher, String subject){
        this.name = name;
        this.dob = dob;
        this.teacher = teacher;
        this.subject = subject;
    }
    @Override
    void getDetails() {
        System.out.println("Name of Student: " + this.getName());
        System.out.println("Date of Birth: "+ this.dob.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Teacher: " + this.teacher.getName());
    }
}
