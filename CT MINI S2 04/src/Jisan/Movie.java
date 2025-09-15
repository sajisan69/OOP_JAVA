package Jisan;

public class Movie {
    String title;
    String genre;
    int duration;
    public Movie(){
        this.title="Unknown";
        this.genre="Unknown";
        this.duration=0;
    }
    public Movie(String title, String genre, int duration){
        this.title=title;
        this.genre=genre;
        this.duration=duration;
    }
    public void displayInfo(){
        System.out.println("Movie Name: "+title);
        System.out.println("Generation: "+genre);
        System.out.println("Duration: "+duration);
    }
}
