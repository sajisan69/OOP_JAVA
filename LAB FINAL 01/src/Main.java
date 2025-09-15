public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new FullTimeEmployee("Akash",01,10000,10);
        employees[1] = new FullTimeEmployee("Jennie",02,10000,12);
        employees[2] = new PartTimeEmployee("Skaib",03,11100,15);
        employees[3] = new PartTimeEmployee("Adams",04,10000,7);
        employees[4] = new PartTimeEmployee("Eve",05,13000,9);
        for(Employee emp: employees){
            System.out.println(emp.getDetails());
        }
        double average = 0.0;
        double total = 0.0;
        for(Employee emp: employees){
            System.out.println(emp.calculateSalary());
        }
        for(Employee emp: employees){
            total += emp.calculateSalary();
        }
        average = total/5;
        System.out.println("average: " + average);
    }
}
