package Jisan;

public class Main {
    public static void main(String[] args) {
        AreaCalculator c=new AreaCalculator();
        System.out.println("Circle Area: " + c.calculateArea(5.0));
        System.out.println("Rectangle Area: " + c.calculateArea(4.0, 6.0));
        System.out.println("Square Area: " + c.calculateArea(7));
    }
}
