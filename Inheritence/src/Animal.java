public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter methods (Encapsulation)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void makeSound() {
        System.out.println("Animal sound");
    }
}
