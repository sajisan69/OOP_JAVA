package Jisan;

public class AreaCalculator {
    double calculateArea(double radius){
        return Math.PI*radius*radius;
    }
    double calculateArea(double length, double width){
        return length*width;
    }
    double calculateArea(int side){
        return side*side;
    }
}
