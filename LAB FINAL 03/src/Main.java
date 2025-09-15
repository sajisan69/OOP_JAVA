public class Main {
    public static void main(String[] args) {
        ElectricCar car1 = new ElectricCar("Tesla", 2022, 80);
        ElectricCar car2 = new ElectricCar("Nissan", 2020, 30);
        car1.start();
        car2.start();
    }
}
