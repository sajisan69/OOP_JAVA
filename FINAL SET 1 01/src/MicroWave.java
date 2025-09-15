class Microwave extends Appliance {
    int powerLevel;
     public Microwave(String brand, int powerLevel) {
        super(brand);
        this.powerLevel = powerLevel;
    }
    void operate() {
        System.out.println("Microwave of brand " + brand + " with power " + powerLevel + "W is heating");
    }
}