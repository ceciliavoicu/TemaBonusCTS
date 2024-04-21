package C.ex2.clase;

public class FactoryBody extends FactoryMedicamente{
    public FactoryBody(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Body(super.getDenumire(), super.getPret());
    }
}
