package problem;

public class Bradesco implements Banco {

    private Pedido pedido;

    public Bradesco(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public Integer getTaxaDeJuros() {
        int totalPedido = this.pedido.getTotal();
        return 30;
    }

}
