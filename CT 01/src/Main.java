public class Main {
    public static void main(String[] args) {
        SmartWatch s1 = new SmartWatch("Samsung", "Galaxy", 2200, true);
        SmartWatch s2 = new SmartWatch("Xiaomi", "Colmi", 50000, false);
        SmartWatch s3 = new SmartWatch("Iqoo", "Z09", 4500, false);
        s1.syncData();
        s1.displaySpecs();
        s2.syncData();
        s2.displaySpecs();
        s3.syncData();
        s3.displaySpecs();
    }
}