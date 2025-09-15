public class Main {
    public static void main(String[] args) {
        TripPlanner t1 = new TripPlanner();
        TripPlanner t2 = new TripPlanner("Paris", 5, 1500.0);
        TripPlanner t3 = new TripPlanner("Tokyo", 10, 3000.0);
        t1.planTrip();
        t2.planTrip("Spring");
        t3.planTrip(true);
    }
}
