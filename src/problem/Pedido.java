package problem;

public class Pedido {

    private int total;

    private String banco;

    Pedido(int total, String banco) {
        this.total = total;
        this.banco = banco;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}
