package labs.lab14concreteabstract;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //TODO 8: declare and initialize the object of ClassroomCourse class
        //Subject subject = new Subject("Yoga", 3);
        //ClassroomCourse crCourse = new ClassroomCourse(subject,"Fabricio", 20, "GS", "session");
        //TODO 9: declare and initialize the Learner object
        //Learner learner = new Learner("Juan", 3.0, crCourse, 2.0);
        //TODO 18: display course list and accept user choice
        System.out.println("*** Select a course: ***\n" +
                "1. Java\n2. Java Online \n" +
                "3.JavaScript \n4.JavaScript Online");
        //TODO 19: initialize object of chose course
        System.out.print("Enter course code: ");
        int intChoice = keyboard.nextInt();
        String choice = switch (intChoice) {
            case 1, 2 -> "Java";
            case 3, 4 -> "JavaScript";
            default -> "";
        };
        if (intChoice%2==0) choice = choice + " Online";


        //TODO 20: accept user input for learner's name
        System.out.print("Enter your name: ");
        String learnerName = keyboard.next();
        Subject subject = new Subject(choice, 4);
        Course course;
        if (intChoice%2==0) {
            course = new OnlineCourse(subject, "Jaimico", 15, 4, 4);
        } else {
            course = new ClassroomCourse(subject, "Juliantla", 15, "UVM", "session");
        }
        Learner learner = new Learner(learnerName, course);
        System.out.println(learner.name + ": you have selected " + course.subject.title);
        //TODO 21: call assignmentScore() method and quizScore() methods
        System.out.print("Assignment marks: ");
        int assignmentMarks = keyboard.nextInt();
        System.out.print("Quiz marks: ");
        int quizMarks = keyboard.nextInt();
        learner.assignmentScore(assignmentMarks);
        learner.quizScore(quizMarks);
        //TODO 22: call assignmentScore() method. Display the result as described
        System.out.println("Assignment marks entered: " + course.assignmentMarks +
                            "\nQuiz marks entered: " + course.quizMarks);
        learner.calculateGrade();
        System.out.println("Grade score: " + learner.gradeScore +
                "\n");
        System.out.print("Congratulations " + learner.name + ". ");
        if (learner.gradeScore >= 5) {
            System.out.println("You have successfully passed the " + subject.title + " course.");
        } else {
            System.out.println("You have completed the " + subject.title + " course.");
        };
    }
}