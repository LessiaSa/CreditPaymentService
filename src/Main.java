//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sumCredit = 1_000_000;
        double loanTerm = 12;
        int monthlyPayment = (int) service.calculate(sumCredit,loanTerm);
        System.out.println (monthlyPayment);
        }
    }
