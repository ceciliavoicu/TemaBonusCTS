package D.ex9.program;

import D.ex9.clase.AgentieComposite;
import D.ex9.clase.Filiala;

public class Main {
    public static void main(String[] args) {
        AgentieComposite sucursala = new AgentieComposite("Sucursala Centrală");

        AgentieComposite agentia1 = new AgentieComposite("Agenția Nord");
        agentia1.adauga(new Filiala("Filiala Nord 1"));
        agentia1.adauga(new Filiala("Filiala Nord 2"));

        AgentieComposite agentia2 = new AgentieComposite("Agenția Sud");
        agentia2.adauga(new Filiala("Filiala Sud 1"));
        agentia2.adauga(new Filiala("Filiala Sud 2"));

        sucursala.adauga(agentia1);
        sucursala.adauga(agentia2);

        sucursala.afiseazaStructura();
    }
}
