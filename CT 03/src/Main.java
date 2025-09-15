public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Bicycle", 21);
        Car car = new Car("Car", "Petrol");
        bicycle.move();
        car.move();
    }
}