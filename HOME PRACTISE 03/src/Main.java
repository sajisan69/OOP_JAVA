//import java.util.ArrayList;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<MovieTicket> tickets=new ArrayList<>();
//        tickets.add(new MovieTicket("KGF", "A25", 500));
//        tickets.add(new MovieTicket("SALAR", "B01", 400));
//        tickets.add(new MovieTicket("VIKRAM", "K17", 350));
//        tickets.add(new MovieTicket("KAITHI", "H13", 360));
//        double totalPrice=0;
//        for(MovieTicket movie : tickets){
//            movie.displayDetails();
//            totalPrice+=movie.price;
//        }
//        double mean=totalPrice/4;
//        System.out.println("MEAN PRICE : "+mean);
//    }
//}
public class Main {
    public static void main(String[] args) {
        MovieTicket[] ticket = new MovieTicket[4];
        ticket[0] = new MovieTicket("KGF", "L12", 300);
        ticket[1] = new MovieTicket("SALAR", "C34", 400);
        ticket[2] = new MovieTicket("KAITHI", "N34", 200);
        ticket[3] = new MovieTicket("LEO", "U34", 500);
        double totalPrice = 0;
        for (MovieTicket movie : ticket) {
            movie.displayDetails();
            totalPrice += movie.price;
        }
        double mean = totalPrice / 4;
        System.out.println("MEAN PRICE : " + mean);
    }
}