//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("John", 24201, 500);
        BankAccount b2=new BankAccount("Roman", 36523, 700);
        BankAccount b3=new BankAccount("Nolik", 5231, 1000);
        b1.displayAccountInfo();
        b2.displayAccountInfo();
        b3.displayAccountInfo();
        b1.deposit(200);
        b3.withdraw(100);
        b2.deposit(300);

        b1.displayAccountInfo();
        b2.displayAccountInfo();
        b3.displayAccountInfo();
    }
}