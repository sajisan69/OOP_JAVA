public class Main {
    public static void main(String[] args){
        Appliance[] appliances = new Appliance[5];
        appliances[0] = new WashingMachine("Samsung", 7);
        appliances[1] = new WashingMachine("LG", 9);
        appliances[2] = new Microwave("Panasonic", 900);
        appliances[3] = new Microwave("Sharp", 1000);
        appliances[4] = new Microwave("Whirlpool", 800);
        for (Appliance a : appliances) {
            a.operate();
        }
    }
}