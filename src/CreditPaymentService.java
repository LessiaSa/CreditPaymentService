public class CreditPaymentService {
    public double calculate(double sumCredit, double loanTerm) {
        int result;
        double interestRate = 9.99;
        double monthlyRate = interestRate / 12;
        double sumMonthly = 1 + monthlyRate;
        double degree = Math.pow(sumMonthly, loanTerm);
        double ratio = (monthlyRate * degree) / (degree - 1);
        double i = sumCredit * ratio;
        result = (int) i;
        return result;
    }
}



