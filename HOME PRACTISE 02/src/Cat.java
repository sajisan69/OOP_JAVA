public class Cat implements Animal{
    String catName;
    public Cat(String catName){
        this.catName=catName;
    }

    @Override
    public void makeSound() {
        System.out.println(catName+" Meow!");
    }
}
