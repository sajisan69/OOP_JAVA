class Car extends Transport {
    String fuelType;
    Car(String type, String fuelType) {
        super(type);
        this.fuelType = fuelType;
    }
    @Override
    void move() {
        super.move();
        System.out.println("Car with" +fuelType+"is driving");
    }
}
