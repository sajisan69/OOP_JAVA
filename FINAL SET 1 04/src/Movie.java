
class Movie {
    String title;
    double rating;
    String genre;

    public Movie(String title, double rating, String genre) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
    }
    public String getSummary() {
        return title + " (" + genre + ") - Rating: " + rating;
    }
}