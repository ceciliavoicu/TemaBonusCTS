package C.ex2.clase;

public class FactoryDurere extends FactoryMedicamente{
    public FactoryDurere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Durere(super.getDenumire(), super.getPret());

    }
}
