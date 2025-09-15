import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> catNames = new ArrayList<>();
        while (true) {
            System.out.print("Enter cat's name (or type 'stop' to finish): ");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("stop")) break;
            catNames.add(name);
        }
        System.out.println("\nCats you entered:");
        for (String cat : catNames) {
            System.out.println(cat);
        }
        if (!catNames.isEmpty()) {
            System.out.println("\nFirst cat is: " + catNames.get(0));
        }
        if (catNames.size() > 1) {
            catNames.set(1, "Fluffy");  // Change second cat's name
            System.out.println("Changed second cat's name to Fluffy.");
        }
        if (!catNames.isEmpty()) {
            String removed = catNames.remove(0);  // Remove first cat
            System.out.println("Removed the first cat: " + removed);
        }
        System.out.println("\nCats after changes:");
        for (String cat : catNames) {
            System.out.println(cat);
        }
    }
}
