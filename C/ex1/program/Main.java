package C.ex1.program;

import C.ex1.clase.Medicament;
import C.ex1.clase.MedicamentFactory;
import C.ex1.clase.TipMedicament;

public class Main {
    public static void main(String args[]) {
        Medicament medicament1= MedicamentFactory.getMedicamente(TipMedicament.BODY,"Nivea",22,7);
        Medicament medicament2= MedicamentFactory.getMedicamente(TipMedicament.RACEALA,"Paracetamol",12,6);
        Medicament medicament3= MedicamentFactory.getMedicamente(TipMedicament.DURERE,"Nurofen",45,1);

        medicament1.afisareDetalii();
        medicament2.afisareDetalii();
        medicament3.afisareDetalii();

    }
}
