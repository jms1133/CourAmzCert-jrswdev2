package labs.lab14concreteabstract;

//TODO 12: make Learner class implement Assessment interface
public class Learner implements Assessments {
    //TODO 1: declare instance variables
    String name;
    Course course;
    double gradeScore;

    Learner(String name, Course course) {
        //TODO 2: complete constructor
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }

    //TODO 13: override assignmentScore() method
    @Override
    public void assignmentScore(int marks) {
        course.assignmentMarks = marks;
    }

    //TODO 14: override quizScore() method
    @Override
    public void quizScore(int marks) {
        course.quizMarks = marks;
    }

    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;
        //TODO 17: calculate gradeScore as per the instructions above
        if (course.subject.title.toLowerCase().contains("online")) {
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;
        } else {
            maxAssignmentMarks = 100;
            maxQuizMarks = 30;
        }
        double assignmentGrade =(double)course.assignmentMarks/maxAssignmentMarks * 10;
        double quizGrade = (double)course.quizMarks/maxQuizMarks * 10;
        this.gradeScore = (assignmentGrade + quizGrade)/2;
        return gradeScore;
    }
}