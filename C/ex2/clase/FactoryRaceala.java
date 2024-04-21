package C.ex2.clase;

public class FactoryRaceala extends FactoryMedicamente{
    public FactoryRaceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Raceala(super.getDenumire(), super.getPret());

    }
}
