package D.ex8.clase;

public class Credit implements ICredit{
    private String moneda;
    private double suma;

    public Credit(String moneda, double suma) {
        this.moneda = moneda;
        this.suma = suma;
    }

    @Override
    public void acordaCredit(double suma) {
        System.out.println("Credit acordat in valoare de "+suma+" "+moneda);
    }
}
