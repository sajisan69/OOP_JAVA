package Jisan;

public class Main {
    public static void main(String[] args) {
        Laptop L1=new Laptop("DELL", "i5", 8, 65000.00);
        Laptop L2=new Laptop("ASUS", "Ryzen 5", 16, 85000.500);
        Laptop L3=new Laptop("HP", "M2", 8, 70000.00);
        L1.upgradeRam(16);
        L1.displayInfo();
        L2.upgradeRam(24);
        L2.displayInfo();
        L3.upgradeRam(16);
        L3.displayInfo();
    }
}