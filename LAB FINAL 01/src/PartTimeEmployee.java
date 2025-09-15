public class PartTimeEmployee extends Employee{
    int hoursWorked;
    double hourlyRate;
    PartTimeEmployee(String name,int id,int hoursWorked,double hourlyRate){
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}