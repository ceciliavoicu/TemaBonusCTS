package C.ex8.clase;

public class Medicament implements IMedicament{
    private  String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    @Override
    public void printStructura(String prefix) {
        System.out.println(prefix + "Medicament: "+ nume);
    }
}
