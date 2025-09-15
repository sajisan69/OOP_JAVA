class ElectricCar extends Vehicle {
    int batteryLevel;

    public ElectricCar(String brand, int year, int batteryLevel) {
        super(brand, year);
        this.batteryLevel = batteryLevel;
    }

    @Override
    void start() {
        super.start();
        if (batteryLevel >= 50) {
            System.out.println("The electric car of " + brand + " is running smoothly.");
        } else {
            System.out.println("Battery too low for " + brand + ". Please charge.");
        }
    }
}