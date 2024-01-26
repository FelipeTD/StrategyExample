package problem;

public class CalculadoraDeJuros {

    CalculadoraDeJuros() {

    }

    public Integer calculaJuros(Pedido pedido) {

        Banco banco = null;

        if (pedido.getBanco().equalsIgnoreCase("Santander")) {
            banco = new Santander(pedido);
        } else if (pedido.getBanco().equalsIgnoreCase("Itau")) {
            banco = new Itau(pedido);
        } else if (pedido.getBanco().equalsIgnoreCase("Bradesco")) {
            banco = new Bradesco(pedido);
        }

        return banco != null ? banco.getTaxaDeJuros() : pedido.getTotal();

    }

}
