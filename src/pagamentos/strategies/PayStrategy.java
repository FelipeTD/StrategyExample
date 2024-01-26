package pagamentos.strategies;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();

}
