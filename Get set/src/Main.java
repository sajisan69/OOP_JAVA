// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student();

        // Use setters to set values
        student1.setName("Alice");
        student1.setAge(20);

        // Use getters to access values
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());

        // Trying invalid age
        student1.setAge(-5);  // Will show validation message
    }
}
