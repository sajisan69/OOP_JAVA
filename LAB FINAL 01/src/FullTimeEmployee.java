public class FullTimeEmployee extends Employee{
    double baseSalary;
    double bonus;
    FullTimeEmployee(String name,int id,double baseSalary,double bonus){
        this.baseSalary =  baseSalary;
        this.id = id;
        this.name = name;
        this.bonus = bonus;
    }
    double calculateSalary() {
        return baseSalary + bonus;
    }
}