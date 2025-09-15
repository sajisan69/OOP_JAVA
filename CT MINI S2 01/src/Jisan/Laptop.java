package Jisan;

public class Laptop {
    String brand;
    String processor;
    int ramsize;
    double price;
    public Laptop(String brand, String processor, int ramsize, double price){
        this.brand=brand;
        this.processor=processor;
        this.ramsize=ramsize;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("Name :"+brand);
        System.out.println("Processor : "+processor);
        System.out.println("RAM ;"+ramsize);
        System.out.println("Price : "+price);
    }
    public void upgradeRam(int newram){
        ramsize=newram;
        System.out.println("Ram upgraded to "+newram+" GB");
    }
}

