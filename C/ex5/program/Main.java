package C.ex5.program;

import C.ex5.clase.Adapter;
import C.ex5.clase.ISistemGestiuneStocuri;
import C.ex5.clase.ISistemVanzare;
import C.ex5.clase.SistemGestiuneStocuri;

public class Main {
    public static void main(String args[]) {
        ISistemGestiuneStocuri iSistemGestiuneStocuri=new SistemGestiuneStocuri();
        ISistemVanzare iSistemVanzare=new Adapter((SistemGestiuneStocuri) iSistemGestiuneStocuri);

        iSistemVanzare.setareMedicament(101);
        boolean disponibil=iSistemVanzare.verificareDisponibilitate(50);
        System.out.println("Medicamentul este disponobil? "+disponibil);

    }
}
