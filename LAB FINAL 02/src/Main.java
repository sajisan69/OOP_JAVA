public class Main {
    public static void main(String[] args) {
        Product[] products={
                new Product("Watch",55,30),
                new Product("Shoe",66,25),
                new Product("Bag",76,28),
                new Product("Shirt",50,35),
                new Product("Tshirt",99,33),
        };
        for(Product pp: products){
            if(pp.getPrice() < 100){
                pp.setQuantity(pp.getQuantity() * 1.2);
            }
        }
        for(Product pp : products){
            System.out.println(pp.getName());
            System.out.println(pp.totalCost());
        }
    }
}