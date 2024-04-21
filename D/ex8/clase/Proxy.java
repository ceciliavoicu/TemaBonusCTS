package D.ex8.clase;

public class Proxy implements ICredit{
    private Credit credit;

    public Proxy(String moneda, double suma){
        if(moneda.equals("RON")){
            this.credit=new Credit(moneda,suma);
        }else {
            throw new IllegalArgumentException("Creditul poate fi acordat doar in RON.");

        }
    }

    @Override
    public void acordaCredit(double suma) {
        if(credit!=null)
            credit.acordaCredit(suma);

    }
}
