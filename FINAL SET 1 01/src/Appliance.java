abstract class Appliance {
    String brand;
    public Appliance(String brand){
        this.brand=brand;
    }
    abstract void operate();
}
