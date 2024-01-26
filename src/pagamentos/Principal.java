package pagamentos;

import pagamentos.order.Order;
import pagamentos.strategies.PayByCreditCard;
import pagamentos.strategies.PayByPayPal;
import pagamentos.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Principal {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {

        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.println("""
                        Por favor, selecione um produto:
                        1 - Placa mae
                        2 - CPU
                        3 - HD
                        4 - Memoria
                        """);
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.println("Quantidade: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalcost(cost * count);
                System.out.println("Gostaria de selecionar mais produtos? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("""
                        Por favor, selecione o metodo de pagamento:
                        1 - PayPal
                        2 - Cartao de Credito
                        """);
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            order.processOrder(strategy);

            System.out.println("Pagar " + order.getTotalcost() + " ou continuar comprando? P/C: ");
            String processed = reader.readLine();
            if (processed.equals("P")) {

                if (strategy.pay(order.getTotalcost())) {
                    System.out.println("Pagamento realizado com sucesso");
                } else {
                    System.out.println("Erro ao realizar o pagamento. Por favor verifique seus dados");
                }
                order.setClosed();
            }

        }

    }

}
