public class MovieTicket {
    String moiveName;
    String seatNo;
    double price;
    public MovieTicket(String moiveName, String seatNo, double price){
        this.moiveName=moiveName;
        this.seatNo=seatNo;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Name : "+moiveName+" Seat No. "+seatNo+" Price : "+price);
    }
}
