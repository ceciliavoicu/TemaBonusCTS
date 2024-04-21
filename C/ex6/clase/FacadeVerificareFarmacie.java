package C.ex6.clase;

public class FacadeVerificareFarmacie {
    private SistemRetete sistemRetete;
    private Depozit depozit;
    private SistemCardSanatate sistemCardSanatate;

    public FacadeVerificareFarmacie(SistemRetete sistemRetete, Depozit depozit, SistemCardSanatate sistemCardSanatate) {
        this.sistemRetete = sistemRetete;
        this.depozit = depozit;
        this.sistemCardSanatate = sistemCardSanatate;
    }

    public boolean verificareTotul(int idReteta, int idMedicament, int cantitate, String codCard){
        boolean retetaValida=sistemRetete.verificareReteta(idReteta);
        boolean stocDisponibilitate=depozit.verificareStod(idMedicament,cantitate);
        boolean cardValid=sistemCardSanatate.verificareCardSanatate(codCard);

        return retetaValida && stocDisponibilitate && cardValid;
    }
}
