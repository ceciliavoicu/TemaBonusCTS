package C.ex1.clase;

public class Durere extends Medicament{
    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul "+super.getDenumire() + " este un medicament de tip Durere, care are pretul de "+super.getPret()+ " RON.");

    }
}
