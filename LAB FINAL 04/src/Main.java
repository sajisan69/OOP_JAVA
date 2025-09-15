import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("CSE101", "Programming", 3, "Core"));
        courses.add(new Course("CSE102", "Data Structures", 3, "Core"));
        courses.add(new Course("CSE110", "CP", 1, "General"));
        courses.add(new Course("MTH101", "Calculus", 3, "Core"));
        courses.add(new Course("OOP120", "ABSTRACTION", 2, "Elective"));
        for (Course c : courses){
            System.out.println(c.getCourseInfo());
        }
        for (Course c : courses) {
            if (c.isMajorCourse()) {
                System.out.println(c.code + " is a major course");
            }
        }
        for (Course c : courses) {
            if (c.credits >= 3) {
                System.out.println(c.code);
            }
        }
    }
}
