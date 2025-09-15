package Jisan;

public class Product {
    private String productName;
    private int productID;
    private double price;
    public Product(String productName, int productID, double price){
        this.productName=productName;
        this.productID=productID;
        this.price=price;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double calculateDiscount(double discountPercentage){
        return price-(price*discountPercentage/100);
    }
    public String productInfo(){
        return "Name "+productName+"\n"+"ID "+productID+"\n"+"Price "+price;
    }
}
