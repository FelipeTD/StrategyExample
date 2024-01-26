package solution;

public class CalculadoraDeJuros {

    private CalculaJurosStrategyInterface calculadorDeJuros;

    CalculadoraDeJuros(CalculaJurosStrategyInterface calculadoraDeJuros) {
        this.calculadorDeJuros = calculadoraDeJuros;
    }

    public int calculaJuros(Pedido pedido) {
        return this.calculadorDeJuros.getTaxaDeJuros(pedido);
    }

}
