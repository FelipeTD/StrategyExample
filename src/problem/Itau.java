package problem;

public class Itau implements Banco {

    private Pedido pedido;

    public Itau(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public Integer getTaxaDeJuros() {
        int totalPedido = this.pedido.getTotal();
        return 20;
    }

}
