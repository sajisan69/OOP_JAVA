package Jisan;

public class Main {
    public static void main(String[] args) {
       Movie m1=new Movie();
       Movie m2=new Movie("Avatar", "Sci-FI", 200);
       m1.displayInfo();
       m2.displayInfo();
    }
}