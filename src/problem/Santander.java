package problem;

public class Santander implements Banco {

    private Pedido pedido;

    public Santander(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public Integer getTaxaDeJuros() {
        int totalPedido = this.pedido.getTotal();
        return 10;
    }

}
