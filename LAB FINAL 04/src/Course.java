public class Course {
    String code;
    String title;
    int credits;
    String type;
    public Course(String code, String title, int credits, String type) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.type = type;
    }
    boolean isMajorCourse() {
        return type.equalsIgnoreCase("Core") && credits >= 3;
    }
    String getCourseInfo() {
        return "Code: " + code + ", Title: " + title + ", Credits: " + credits + ", Type: " + type;
    }
}
