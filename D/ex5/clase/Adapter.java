package D.ex5.clase;

public class Adapter implements ICreditService{
    private Leasing leasing;
    private String clientNume;

    public Adapter(Leasing leasing, String clientNume) {
        this.leasing = leasing;
        this.clientNume = clientNume;
    }



    @Override
    public void acordaCredit(double suma, int durataInLuni) {
        leasing.oferaLeasing(clientNume,suma,durataInLuni);
    }
}
