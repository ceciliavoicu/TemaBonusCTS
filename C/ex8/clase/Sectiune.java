package C.ex8.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IMedicament {
    private String nume;
    private List<IMedicament> subcomponente=new ArrayList<>();

    public Sectiune(String nume) {
        this.nume = nume;

    }

    public void  adaugaComponente(IMedicament componente){
        subcomponente.add(componente);
    }

    public void stergeComponente(IMedicament componente){
        subcomponente.remove(componente);
    }

    @Override
    public void printStructura(String prefix) {
        System.out.println(prefix + "Sectiune: "+ nume);
        for(IMedicament medicament:subcomponente){
            medicament.printStructura(prefix+ " ");
        }
    }
}
