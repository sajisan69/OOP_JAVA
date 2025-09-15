public class Dog implements Animal{
    String dogName;
    public Dog(String dogName){
        this.dogName=dogName;
    }

    @Override
    public void makeSound() {
        System.out.println(dogName+" Woof!");
    }
}
