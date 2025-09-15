package Jisan;

public class Main {
    public static void main(String[] args) {
        Product p=new Product("Toy", 50, 510.00);
        p.setPrice(480.00);
        System.out.println(p.productInfo());
        System.out.println(p.calculateDiscount(10));
    }
}