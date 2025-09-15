import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Dog> dogs = new ArrayList<>();
        while (true) {
            System.out.print("Enter Dog's name (type 'stop' to finish): ");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            dogs.add(new Dog(name));
        }
        for (Dog dog : dogs) {
            dog.sound();
        }
    }
}
//Scanner s=new Scanner(System.in);
//ArrayList<> names=new ArrayList<>();
//    while(true){
//String names=s.nextLine();
//        if(names.equalsIgnoreCase("stop")){
//        break;
//        }
//        Dog.add(new Dog(names));
//        }
//        for(Dog d: dog){
//        d.sound();
//    }