public class BillCalculator {
    double generateBill(double amount){
        return amount+(amount*0.05);
    }

    double generateBill(double amount, double discountPercent){
        double discountedAmount=amount-(amount*(discountPercent/100));
          return discountedAmount+(discountedAmount*0.05);
    }
    double generateBill(double amount,int items,double discountPercent){
        double taxedAmount=amount-(amount*(discountPercent/100));
         return taxedAmount+(items*10);
    }
}
