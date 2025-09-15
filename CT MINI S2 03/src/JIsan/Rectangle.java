package JIsan;

public class Rectangle extends Shape{
    double width;
    double height;
    public Rectangle(String colour, double width, double height){
        super(colour);
        this.width=width;
        this.height=height;
    }
    @Override
    public double getArea() {
        return width*height;
    }
}
