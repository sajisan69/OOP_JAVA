public class Main {
    public static void main(String[] args) {
        StudentRecord s1=new StudentRecord("Jisan", 242071117, 3.87);
        s1.updateGpa(3.91);
        System.out.println(s1.generateRecord());
    }
}