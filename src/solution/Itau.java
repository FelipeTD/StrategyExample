package solution;

public class Itau implements CalculaJurosStrategyInterface{

    @Override
    public int getTaxaDeJuros(Pedido pedido) {
        return 20;
    }

}
