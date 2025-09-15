package JIsan;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle("Red", 5.00);
        Rectangle r=new Rectangle("Green", 4.00, 3.00);
        System.out.println("Circle area : "+c.getArea());
        System.out.println("Rectangle area : "+r.getArea()
        );
    }
}