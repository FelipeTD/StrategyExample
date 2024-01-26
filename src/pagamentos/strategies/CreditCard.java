package pagamentos.strategies;

public class CreditCard {

    private int ammount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv) {
        this.ammount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

}
