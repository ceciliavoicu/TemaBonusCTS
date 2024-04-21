package D.ex9.clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieComposite extends UnitateBancara{
    private List<UnitateBancara> unitati=new ArrayList<>();
    public AgentieComposite(String nume) {
        super(nume);
    }

    @Override
    public void adauga(UnitateBancara unitateBancara) {
        unitati.add(unitateBancara);
    }

    @Override
    public void sterge(UnitateBancara unitateBancara) {

        unitati.remove(unitateBancara);
    }

    @Override
    public void afiseazaStructura() {

        System.out.println(nume);
        for(UnitateBancara unitateBancara:unitati){
            unitateBancara.afiseazaStructura();
        }
    }
}
