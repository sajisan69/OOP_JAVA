class Vehicle {
    String brand;
    int year;
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    void start() {
        System.out.println("Starting vehicle from " + year);
    }
}