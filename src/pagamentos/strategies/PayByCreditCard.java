package pagamentos.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Digite o numero do seu cartao: ");
            String number = READER.readLine();
            System.out.println("Digite a data de expiracao do seu cartao: ");
            String date = READER.readLine();
            System.out.println("Digite o codigo CVV do seu cartao: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit card.");
            card.setAmmount(card.getAmmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }

}
