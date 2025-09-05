package labs.lab12classhierperson;

public class Main {
    public static void main(String[] args) {
        Date dobOfStudent, dobOfTeacher, dobOfAppointment;

        dobOfStudent = new Date(1,1,2005);
        dobOfTeacher = new Date(10, 10, 1995);
        dobOfAppointment = new Date(1,4,2024);

        Teacher teacher = new Teacher("Madhavan", dobOfTeacher, dobOfAppointment, "MTech", "Electronics");
        Student student = new Student("Belinda", dobOfStudent, teacher, "Electronics");
        teacher.setSalary(50000);

        teacher.getDetails();
        student.getDetails();
    }
}
