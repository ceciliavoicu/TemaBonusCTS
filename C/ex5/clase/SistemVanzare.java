package C.ex5.clase;

public class SistemVanzare implements ISistemVanzare {
    private int medicamentCurent;
    @Override
    public void setareMedicament(int idMedicament) {
        this.medicamentCurent=idMedicament;

    }

    @Override
    public boolean verificareDisponibilitate(int numarDorit) {
        return true;
    }
}
