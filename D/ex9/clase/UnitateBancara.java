package D.ex9.clase;

public abstract class UnitateBancara {
    protected String nume;

    public UnitateBancara(String nume) {
        this.nume = nume;
    }

    public abstract void adauga(UnitateBancara unitateBancara);
    public abstract void sterge(UnitateBancara unitateBancara);
    public abstract void afiseazaStructura();
}
