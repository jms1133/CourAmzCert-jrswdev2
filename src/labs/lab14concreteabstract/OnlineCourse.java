package labs.lab14concreteabstract;

class OnlineCourse extends Course  {
    //TODO 15: include videoLessons and weeks attributes
    int lessons, weeks;

    OnlineCourse(Subject subject, String instructor, int fee, int lessons, int weeks) {
        super(subject, instructor, fee);
        //TODO 16: initialize other attributes
        this.lessons = lessons;
        this.weeks = weeks;
    }
}
