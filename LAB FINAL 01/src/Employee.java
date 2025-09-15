public abstract class Employee {
    String name;
    int id;
    abstract double calculateSalary();
    String getDetails(){
        return "Name: " + name +"\n" + " Id: " + id;
    }
}
