import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Dog("Tom"));
        animals.add(new Dog("Tiger"));
        animals.add(new Cat("Micky"));
        animals.add(new Cat("Jerry"));
        for(Animal animal: animals){
            animal.makeSound();
        }
    }
}