public class Restaurant {
    String name;
    String cuisine;
    int seats;
    public Restaurant(){
        this.name="Unknown";
        this.cuisine="Unknown";
        this.seats=0;
    }
    public Restaurant(String name, String cuisine, int seats){
        this.name=name;
        this.cuisine=cuisine;
        this.seats=seats;
    }
    public void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Cuisine : "+cuisine);
        System.out.println("Seats : "+seats);
    }
}
