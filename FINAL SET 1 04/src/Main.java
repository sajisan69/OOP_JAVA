import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avengers", 8.2, "action"));
        movies.add(new Movie("Notebook", 7.0, "Romance"));
        movies.add(new Movie("Inception", 8.8, "Sci-Fi"));
        movies.add(new Movie("Mad Max", 7.6, "Action"));
        movies.add(new Movie("Frozen", 7.5, "Animation"));
        for (Movie m : movies) {
            System.out.println(m.getSummary());
        }
        Movie topRatedMovie=movies.get(0);
        for (Movie m : movies){
            if (m.rating > topRatedMovie.rating) {
                topRatedMovie = m;
            }
        }
        System.out.println("Top Rated: " + topRatedMovie.title + " (" + topRatedMovie.genre + ")");
        System.out.println("Action movies with rating >= 7.5:");
        for (Movie m : movies) {
            if (m.genre.equalsIgnoreCase("Action") && m.rating >= 7.5) {
                System.out.println(m.title + " - " + m.rating);
            }
        }
    }
}
