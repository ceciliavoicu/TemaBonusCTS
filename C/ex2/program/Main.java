package C.ex2.program;

import C.ex2.clase.*;

public class Main {
    public static void main(String args[])
    {
        FactoryMedicamente factoryRaceala= new FactoryRaceala("Paracetamol",10);
        Medicament medicament1=factoryRaceala.creareMedicament();
        FactoryMedicamente factoryDurere= new FactoryDurere("Ibuprofen",20);
        Medicament medicament2=factoryDurere.creareMedicament();
        FactoryMedicamente factoryBody= new FactoryBody("Aspirina",12);
        Medicament medicament3=factoryBody.creareMedicament();

        System.out.println(medicament1.afisareDetalii());
        System.out.println(medicament2.afisareDetalii());
        System.out.println(medicament3.afisareDetalii());


    }

    public static void procesareMedicament(FactoryMedicamente factoryMedicamente) {
        Medicament medicament= factoryMedicamente.creareMedicament();
        System.out.println(medicament.afisareDetalii());
    }
}
