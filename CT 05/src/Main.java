public class Main {
    public static void main(String[] args) {
        BillCalculator b1=new BillCalculator();
    double bill1= b1.generateBill(1000);
    double bill2=b1.generateBill(500, 10);
    double bill3=b1.generateBill(1000, 5, 10);
      System.out.println("Bill After Discount: "+bill1);
        System.out.println("Bill : "+bill2);
        System.out.println("Bill : "+bill3);
    }
}