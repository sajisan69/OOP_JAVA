public class WashingMachine extends Appliance{
        int loadCapacity;
         WashingMachine(String brand, int loadCapacity) {
            super(brand);
            this.loadCapacity = loadCapacity;
        }
        void operate() {
            System.out.println("WashingMachine of brand " + brand + " with capacity " + loadCapacity + "kg is operating");
        }
    }

