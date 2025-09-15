import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Cat> cats = new ArrayList<>();
        while (true) {
            System.out.print("Enter cat's name (or type 'stop' to finish): ");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            cats.add(new Cat(name));
        }
        System.out.println("\nCats you entered:");
        for (Cat cat : cats) {
            cat.meow();
        cats.clear();
        }
    }
}
