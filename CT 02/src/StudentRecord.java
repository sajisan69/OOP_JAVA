public class StudentRecord {
    private String name;
    private int roll;
    private double gpa;
    public StudentRecord(String name, int roll, double gpa) {
        this.name = name;
        this.roll = roll;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll=roll;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa=gpa;
    }
    public String generateRecord() {
        return "Name: " +name+"\n"+"Roll: "+roll+"\n"+"CGPA: "+gpa+"\n";
    }
    public void updateGpa(double newGpa) {
        this.gpa=newGpa;
    }
}
