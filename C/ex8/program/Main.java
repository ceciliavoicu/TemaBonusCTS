package C.ex8.program;

import C.ex8.clase.Medicament;
import C.ex8.clase.Sectiune;

public class Main {
    public static  void main(String[] args){
        Sectiune raceala = new Sectiune("Raceala");
        Sectiune adulti = new Sectiune("Adulti");
        Sectiune copii = new Sectiune("Copii");

        Medicament paracetamol=new Medicament("Paracetamol");
        Medicament ibuprofen=new Medicament("Ibuprofen");

        adulti.adaugaComponente(paracetamol);
        copii.adaugaComponente(ibuprofen);

        raceala.adaugaComponente(adulti);
        raceala.adaugaComponente(copii);

        raceala.printStructura(" ");


    }
}
