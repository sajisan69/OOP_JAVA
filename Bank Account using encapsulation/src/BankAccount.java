public class BankAccount {
    private String name;
    private int accountNo;
    private double balance;
    public BankAccount(String name, int accountNo, double balance){
        this.name=name;
        this.accountNo=accountNo;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited "+amount);
        }
        else{
            System.out.println("Must be positive");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw : "+amount);
        }
        else if(amount<0){
            System.out.println("Input positive amount");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Name : "+name);
        System.out.println("Account No : "+accountNo);
        System.out.println("Balance : "+ balance);
    }
}
