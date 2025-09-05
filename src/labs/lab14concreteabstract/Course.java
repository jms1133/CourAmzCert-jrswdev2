package labs.lab14concreteabstract;

abstract class Course {
    //TODO 3: include instance variables for Course class and complete constructor code
    Subject subject;
    String instructor;
    int fee, assignmentMarks, quizMarks;

    Course(Subject subject, String instructor, int fee) {
        this.subject = subject;
        this.instructor = instructor;
        this.fee = fee;
    }

}
