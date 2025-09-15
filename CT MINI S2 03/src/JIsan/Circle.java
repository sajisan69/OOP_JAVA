package JIsan;

public class Circle extends Shape{
    double radius;
    public Circle(String colour, double radius){
        super(colour);
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
