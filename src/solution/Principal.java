package solution;

public class Principal {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(10);
        CalculadoraDeJuros calculadora = new CalculadoraDeJuros(new Santander());
        System.out.println(calculadora.calculaJuros(pedido));

    }

}
