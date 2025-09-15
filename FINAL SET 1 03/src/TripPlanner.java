class TripPlanner {
    String destination;
    int days;
    double budget;

    public TripPlanner() {
        destination = "Unknown";
        days = 0;
        budget = 0.0;
    }

    public TripPlanner(String destination, int days, double budget) {
        this.destination = destination;
        this.days = days;
        this.budget = budget;
    }

    void planTrip() {
        System.out.println("Planning trip to " + destination);
    }

    void planTrip(String season) {
        System.out.println("Planning trip to " + destination + " during " + season);
    }
    void planTrip(boolean includeFlights) {
        if (includeFlights) {
            System.out.println("Planning trip to " + destination + " with flights included");
        } else {
            System.out.println("Planning trip to " + destination + " without flights");
        }
    }
}
