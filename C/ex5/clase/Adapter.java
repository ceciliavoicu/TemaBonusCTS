package C.ex5.clase;

public class Adapter extends SistemVanzare {
    private SistemGestiuneStocuri sistemGestiuneStocuri;
    private int medicamentCurent;

    public Adapter(SistemGestiuneStocuri sistemGestiuneStocuri) {
        this.sistemGestiuneStocuri = sistemGestiuneStocuri;
    }

    @Override
    public void setareMedicament(int idMedicament) {
        this.medicamentCurent=idMedicament;
    }

    @Override
    public boolean verificareDisponibilitate(int numarDorit) {
        return sistemGestiuneStocuri.verificareStocPentruMedicament(medicamentCurent,numarDorit);
    }
}
