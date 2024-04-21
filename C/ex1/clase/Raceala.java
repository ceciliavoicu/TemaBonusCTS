package C.ex1.clase;

public class Raceala extends Medicament{
    public Raceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicamentul "+super.getDenumire() + " este un medicament de tip Raceala, care are pretul de "+super.getPret()+ " RON.");

    }
}
