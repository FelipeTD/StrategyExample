package solution;

public class Santander implements CalculaJurosStrategyInterface {

    @Override
    public int getTaxaDeJuros(Pedido pedido) {
        return 10;
    }

}
